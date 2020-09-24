package RertofitApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Caleb.F
 * on 2020-03-02
 * at 10:05
 * Retrofit其实我们可以理解为OkHttp的加强版，它也是一个网络加载框架。
 * 底层是使用OKHttp封装的。准确来说,网络请求的工作本质上是OkHttp完成，
 * 而 Retrofit 仅负责网络请求接口的封装。它的一个特点是包含了特别多注解，
 * 方便简化你的代码量。并且还支持很多的开源库(著名例子：Retrofit + RxJava)。
 * Retrofit和OkHttp都是square公司写的.
 */
public class RetrofitUtil {
    private static final RetrofitUtil ourInstance = new RetrofitUtil();
    private static final String BASE_URL = "http://10.10.211.251:8085/dataInterface/";
    private Retrofit mRetrofit;

    public static RetrofitUtil getInstance() {
        return ourInstance;
    }

    private RetrofitUtil() {
        initRetrofit();
    }

    private void initRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().
                    baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public <T> T create(Class<T> clazz) {
        return mRetrofit.create(clazz);
    }
}
