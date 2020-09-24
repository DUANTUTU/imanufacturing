package com.lenovo.manufacture.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.lenovo.manufacture.R;
import com.lenovo.manufacture.Util.Share;

import org.litepal.LitePal;

import RetrofitBean.CarBean;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author Amoly
 * @date 2019/10/24.
 * GitHub：
 * email：
 * description：
 */
public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWebView();
        LitePal.initialize(this);
        Share.getInstance().initData();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @SuppressLint({"SetJavaScriptEnabled"})
    private void initWebView() {

        TWebView webView = new TWebView(this, null);
        ViewGroup viewParent = findViewById(R.id.webView1);
        viewParent.addView(webView, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT));

        webView.loadUrl("file:///android_asset/index.html");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                /* mWebView.showLog("test Log"); */
            }
        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);//自动打开窗口
        webView.setBackgroundColor(0);
        webView.requestFocus();
        webView.addJavascriptInterface(new JavaScriptInterface(this), "nativeMethod");
        WebSettings webSetting = webView.getSettings();
        webSetting.setAllowFileAccess(true);
        webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);//设置布局，会引起WebView的重新布局（relayout）,默认值NARROW_COLUMNS
        webSetting.setSupportZoom(true);//WebView是否支持使用屏幕上的缩放控件和手势进行缩放，默认值true
        webSetting.setBuiltInZoomControls(true);//可以使用特殊的缩放机制。该项设置不会影响zoomIn() and zoomOut()的缩放操作。
        webSetting.setUseWideViewPort(true);//WebView是否支持HTML的“viewport”标签或者使用wide viewport。设置值为true时，布局的宽度总是与WebView控件上的设备无关像素（device-dependent pixels）宽度一致。当值为true且页面包含viewport标记，将使用标签指定的宽度。如果页面不包含标签或者标签没有提供宽度，那就使用wide viewport。
        webSetting.setSupportMultipleWindows(false);//设置WebView是否支持多窗口。如果设置为true，主程序要实现onCreateWindow(WebView, boolean, boolean, Message)，默认false
        webSetting.setAppCacheEnabled(true);
        webSetting.setDomStorageEnabled(true);//DOM存储API是否可用，默认false。
        webSetting.setDefaultTextEncodingName("utf-8");
        webSetting.setAppCacheMaxSize(Long.MAX_VALUE);


        int screenDensity = getResources().getDisplayMetrics().densityDpi;
        WebSettings.ZoomDensity zoomDensity = WebSettings.ZoomDensity.MEDIUM;
        switch (screenDensity) {
            case DisplayMetrics.DENSITY_LOW:
                zoomDensity = WebSettings.ZoomDensity.CLOSE;
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                zoomDensity = WebSettings.ZoomDensity.MEDIUM;
                break;
            case DisplayMetrics.DENSITY_HIGH:
                zoomDensity = WebSettings.ZoomDensity.FAR;
                break;
        }
        webSetting.setDefaultZoom(zoomDensity);
    }


    public class JavaScriptInterface {
        Activity mActivity;

        JavaScriptInterface(Activity mActivity) {
            this.mActivity = mActivity;
        }

        /**
         * 与js交互时用到的方法，在js里直接调用的
         */
        @JavascriptInterface
        public void startActivity(int index) {
            Intent intent = new Intent();
//            intent.putExtra("fromWhich", "webViewUrl");
//            intent.putExtra("replyID", "replyID");
            switch (index) {
                case 0:
                    intent.setClass(mActivity, LightContorlActivity.class);
                    break;
                case 1:
                    intent.setClass(mActivity, PersonMarketActivity.class);
                    break;
                case 2:
                    intent.setClass(mActivity, ProductionLineActivity.class);
                    break;
                case 3:
                    intent.setClass(mActivity, MakeCarActivity.class);
                    break;
                default:
                    break;

            }

            mActivity.startActivity(intent);
        }
    }

}
