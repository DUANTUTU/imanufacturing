package RetrofitBean;

/**
 * Created by Caleb.F
 * on 2020-03-02
 * at 15:56
 */
public class WorkerInfoBean {
    private String mName;
    private String mWorkerType;
    private String mMoney;

    public WorkerInfoBean(String name, String workerType, String money) {
        mName = name;
        mWorkerType = workerType;
        mMoney = money;
    }

    public String getName() {
        return mName;
    }

    public WorkerInfoBean setName(String name) {
        mName = name;
        return this;
    }

    public String getWorkerType() {
        return mWorkerType;
    }

    public WorkerInfoBean setWorkerType(String workerType) {
        mWorkerType = workerType;
        return this;
    }

    public String getMoney() {
        return mMoney;
    }

    public WorkerInfoBean setMoney(String money) {
        mMoney = money;
        return this;
    }

    @Override
    public String toString() {
        return "WorkerInfoBean{" +
                "mName='" + mName + '\'' +
                ", mWorkerType='" + mWorkerType + '\'' +
                ", mMoney='" + mMoney + '\'' +
                '}';
    }
}
