package RertofitApi;

import RetrofitBean.CarBean;
import RetrofitBean.CarInfoBean;
import RetrofitBean.InformationBean;
import RetrofitBean.LightBean;
import RetrofitBean.PLStepBean;
import RetrofitBean.PartBean;
import RetrofitBean.PassRateBean;
import RetrofitBean.PeopleBean;
import RetrofitBean.PersonBean;
import RetrofitBean.ProductionLineBean;
import RetrofitBean.ProductionLineInfoBean;
import RetrofitBean.StageBean;
import RetrofitBean.SuppierBean;
import RetrofitBean.SuppierListBean;
import RetrofitBean.UserAppointmentBean;
import RetrofitBean.UserInPriceLogBean;
import RetrofitBean.UserNormalCarLogBean;
import RetrofitBean.UserNormalCarStoreBean;
import RetrofitBean.UserOutPriceLogBean;
import RetrofitBean.UserPartLogBean;
import RetrofitBean.UserPartPurchaseLogBean;
import RetrofitBean.UserPartStoreBean;
import RetrofitBean.UserPartsBean;
import RetrofitBean.UserPeopleBean;
import RetrofitBean.UserPeopleLogBean;
import RetrofitBean.UserPlStepBean;
import RetrofitBean.UserPlStepInfoBean;
import RetrofitBean.UserProductionLineBean;
import RetrofitBean.UserQuestionBean;
import RetrofitBean.UserQuestionLogBean;
import RetrofitBean.UserRepairCarLogBean;
import RetrofitBean.UserRepairCarStoreBean;
import RetrofitBean.UserSellOutLogBean;
import RetrofitBean.UserWorkBean;
import RetrofitBean.UserWorkEnvironmentalBean;
import RetrofitBean.UserWorkEnvironmentalLogBean;
import RetrofitBean.UserWorkInfoBean;
import RetrofitBean.WorkPostBean;
import RetrofitBean.plStepCostBean;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Caleb.F
 * on 2020-03-01
 * at 15:36
 */
public interface RetrofitApi {
    @FormUrlEncoded
    @POST("UserWorkEnvironmental/updateAcOnOff")
    Call<LightBean> setWind(@Field("id") int id,
                            @Field("acOnOff") String actionOff);

    @POST("People/getAll")
    Call<PersonBean> getAllPerson();


    @POST("Car/getAll")
    Call<CarBean> getCar();

    @POST("CarInfo/getAll")
    Call<CarInfoBean> getCarInfo();

    @POST("UserWorkEnvironmentalLog/getAll")
    Call<UserWorkEnvironmentalLogBean> getUserWorkEnvironmentalLog();

    @POST("ProductionLine/getAll")
    Call<ProductionLineBean> getProductionLine();

    @POST("ProductionLineInfo/getAll")
    Call<ProductionLineInfoBean> getProductionLineInfo();

    @POST("Stage/getAll")
    Call<StageBean> getStage();

    @POST("PLStep/getAll")
    Call<PLStepBean> getPLStep();

    @POST("WorkPost/getAll")
    Call<WorkPostBean> getWorkPost();

    @POST("People/getAll")
    Call<PeopleBean> getPeople();

    @POST("Part/getAll")
    Call<PartBean> getPart();

    @POST("Suppier/getAll")
    Call<SuppierBean> getSuppier();

    @POST("SuppierList/getAll")
    Call<SuppierListBean> getSuppierList();

    @POST("PassRate/getAll")
    Call<PassRateBean> getPassRate();

    @POST("UserWork/getAll")
    Call<UserWorkBean> getUserWork();

    @POST("UserWorkInfo/getAll")
    Call<UserWorkInfoBean> getUserWorkInfo();

    @POST("UserWorkEnvironmental/getAll")
    Call<UserWorkEnvironmentalBean> getUserWorkEnvironmental();

    @POST("plStepCost/getAll")
    Call<plStepCostBean> getplStepCost();

    @POST("UserInPriceLog/getAll")
    Call<UserInPriceLogBean> getUserInPriceLog();

    @POST("UserOutPriceLog/getAll")
    Call<UserOutPriceLogBean> getUserOutPriceLog();

    @POST("UserProductionLine/getAll")
    Call<UserProductionLineBean> getUserProductionLine();


    @POST("UserPlStep/getAll")
    Call<UserPlStepBean> getUserPlStep();


    @POST("UserPlStepInfo/getAll")
    Call<UserPlStepInfoBean> getUserPlStepInfo();

    @POST("UserParts/getAll")
    Call<UserPartsBean> getUserParts();

    @POST("UserPartStore/getAll")
    Call<UserPartStoreBean> getUserPartStore();

    @POST("UserPartLog/getAll")
    Call<UserPartLogBean> getUserPartLog();

    @POST("UserPartPurchaseLog/getAll")
    Call<UserPartPurchaseLogBean> getUserPartPurchaseLog();

    @POST("UserNormalCarStore/getAll")
    Call<UserNormalCarStoreBean> getUserNormalCarStore();

    @POST("UserRepairCarStore/getAll")
    Call<UserRepairCarStoreBean> getUserRepairCarStore();

    @POST("UserNormalCarLog/getAll")
    Call<UserNormalCarLogBean> getUserNormalCarLog();

    @POST("UserRepairCarLog/getAll")
    Call<UserRepairCarLogBean> getUserRepairCarLog();

    @POST("UserPeople/getAll")
    Call<UserPeopleBean> getUserPeople();

    @POST("UserPeopleLog/getAll")
    Call<UserPeopleLogBean> getUserPeopleLog();

    @POST("UserQuestion/getAll")
    Call<UserQuestionBean> getUserQuestion();

    @POST("UserQuestionLog/getAll")
    Call<UserQuestionLogBean> getUserQuestionLog();

    @POST("UserSellOutLog/getAll")
    Call<UserSellOutLogBean> getUserSellOutLog();

    @POST("UserAppointment/getAll")
    Call<UserAppointmentBean> getUserAppointment();

    @POST("Information/getAll")
    Call<InformationBean> getInformation();

}
