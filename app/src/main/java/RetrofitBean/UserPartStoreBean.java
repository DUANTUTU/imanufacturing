package RetrofitBean;

import java.util.List;

public class UserPartStoreBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":2534,"userWorkId":2,"partId":1,"userProductionLineId":1770,"num":1},{"id":5905,"userWorkId":1,"partId":17,"userProductionLineId":2431,"num":4},{"id":5904,"userWorkId":1,"partId":14,"userProductionLineId":2431,"num":3},{"id":5903,"userWorkId":1,"partId":5,"userProductionLineId":2431,"num":1},{"id":5906,"userWorkId":1,"partId":26,"userProductionLineId":2431,"num":3}]
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
         * id : 2534
         * userWorkId : 2
         * partId : 1
         * userProductionLineId : 1770
         * num : 1
         */

        private int id;
        private int userWorkId;
        private int partId;
        private int userProductionLineId;
        private int num;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserWorkId() {
            return userWorkId;
        }

        public void setUserWorkId(int userWorkId) {
            this.userWorkId = userWorkId;
        }

        public int getPartId() {
            return partId;
        }

        public void setPartId(int partId) {
            this.partId = partId;
        }

        public int getUserProductionLineId() {
            return userProductionLineId;
        }

        public void setUserProductionLineId(int userProductionLineId) {
            this.userProductionLineId = userProductionLineId;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
