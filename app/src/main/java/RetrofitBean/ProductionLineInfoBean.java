package RetrofitBean;

import java.util.List;

public class ProductionLineInfoBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":1,"gold":2000,"stageId":25,"needEnergyNum":14,"capacity":null},{"id":2,"gold":1000,"stageId":5,"needEnergyNum":10,"capacity":null},{"id":3,"gold":1500,"stageId":45,"needEnergyNum":16,"capacity":null}]
     */

    private int status;
    private String message;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * gold : 2000
         * stageId : 25
         * needEnergyNum : 14
         * capacity : null
         */

        private int id;
        private int gold;
        private int stageId;
        private int needEnergyNum;
        private Object capacity;

        public List<Integer> stages;//新增内容


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public int getStageId() {
            return stageId;
        }

        public void setStageId(int stageId) {
            this.stageId = stageId;
        }

        public int getNeedEnergyNum() {
            return needEnergyNum;
        }

        public void setNeedEnergyNum(int needEnergyNum) {
            this.needEnergyNum = needEnergyNum;
        }

        public Object getCapacity() {
            return capacity;
        }

        public void setCapacity(Object capacity) {
            this.capacity = capacity;
        }
    }
}
