package RetrofitBean;

import java.util.List;

public class WorkPostBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":1,"workPostName":"轿车汽车工程师","productionLineInfoId":1,"status":0,"consume":2},{"id":2,"workPostName":"轿车汽车工人","productionLineInfoId":1,"status":1,"consume":2},{"id":3,"workPostName":"轿车汽车技术人员","productionLineInfoId":1,"status":2,"consume":2},{"id":4,"workPostName":"轿车汽车检测员","productionLineInfoId":1,"status":3,"consume":2},{"id":5,"workPostName":"MPV汽车工程师","productionLineInfoId":2,"status":0,"consume":2},{"id":6,"workPostName":"MPV汽车工人","productionLineInfoId":2,"status":1,"consume":2},{"id":7,"workPostName":"MPV汽车技术人员","productionLineInfoId":2,"status":2,"consume":2},{"id":8,"workPostName":"MPV汽车检测人员","productionLineInfoId":2,"status":3,"consume":2},{"id":9,"workPostName":"SUV汽车工程师","productionLineInfoId":3,"status":0,"consume":2},{"id":10,"workPostName":"SUV汽车工人","productionLineInfoId":3,"status":1,"consume":2},{"id":11,"workPostName":"SUV汽车技术人员","productionLineInfoId":3,"status":2,"consume":2},{"id":12,"workPostName":"SUV汽车质检员","productionLineInfoId":3,"status":3,"consume":2}]
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
         * workPostName : 轿车汽车工程师
         * productionLineInfoId : 1
         * status : 0
         * consume : 2
         */

        private int id;
        private String workPostName;
        private int productionLineInfoId;
        private int status;
        private int consume;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getWorkPostName() {
            return workPostName;
        }

        public void setWorkPostName(String workPostName) {
            this.workPostName = workPostName;
        }

        public int getProductionLineInfoId() {
            return productionLineInfoId;
        }

        public void setProductionLineInfoId(int productionLineInfoId) {
            this.productionLineInfoId = productionLineInfoId;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getConsume() {
            return consume;
        }

        public void setConsume(int consume) {
            this.consume = consume;
        }
    }
}
