package RetrofitBean;

import java.util.List;

public class UserPeopleBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":3473,"userWorkId":1,"power":40,"peopleId":23,"userProductionLineId":2431,"workPostId":7},{"id":3472,"userWorkId":1,"power":100,"peopleId":25,"userProductionLineId":2431,"workPostId":5},{"id":3471,"userWorkId":1,"power":100,"peopleId":22,"userProductionLineId":2431,"workPostId":""},{"id":3470,"userWorkId":1,"power":50,"peopleId":17,"userProductionLineId":2431,"workPostId":""},{"id":3469,"userWorkId":1,"power":100,"peopleId":15,"userProductionLineId":2431,"workPostId":""},{"id":3468,"userWorkId":1,"power":100,"peopleId":16,"userProductionLineId":2431,"workPostId":""},{"id":1177,"userWorkId":2,"power":98,"peopleId":4,"userProductionLineId":1771,"workPostId":""},{"id":1176,"userWorkId":2,"power":98,"peopleId":7,"userProductionLineId":1771,"workPostId":""},{"id":1175,"userWorkId":2,"power":98,"peopleId":6,"userProductionLineId":1771,"workPostId":""},{"id":1174,"userWorkId":2,"power":98,"peopleId":5,"userProductionLineId":1771,"workPostId":""},{"id":1173,"userWorkId":2,"power":100,"peopleId":14,"userProductionLineId":1770,"workPostId":""},{"id":1172,"userWorkId":2,"power":100,"peopleId":3,"userProductionLineId":1770,"workPostId":""},{"id":1171,"userWorkId":2,"power":50,"peopleId":2,"userProductionLineId":1770,"workPostId":""},{"id":1170,"userWorkId":2,"power":100,"peopleId":1,"userProductionLineId":1770,"workPostId":""},{"id":3467,"userWorkId":1,"power":62,"peopleId":4,"userProductionLineId":2430,"workPostId":4},{"id":3466,"userWorkId":1,"power":62,"peopleId":3,"userProductionLineId":2430,"workPostId":3},{"id":3465,"userWorkId":1,"power":100,"peopleId":2,"userProductionLineId":2430,"workPostId":""},{"id":3464,"userWorkId":1,"power":62,"peopleId":1,"userProductionLineId":2430,"workPostId":1},{"id":3474,"userWorkId":1,"power":82,"peopleId":30,"userProductionLineId":2430,"workPostId":2},{"id":3475,"userWorkId":1,"power":100,"peopleId":5,"userProductionLineId":2430,"workPostId":""},{"id":3476,"userWorkId":1,"power":100,"peopleId":7,"userProductionLineId":2430,"workPostId":""},{"id":3477,"userWorkId":1,"power":100,"peopleId":8,"userProductionLineId":2430,"workPostId":""},{"id":3478,"userWorkId":null,"power":null,"peopleId":null,"userProductionLineId":null,"workPostId":""}]
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
         * id : 3473
         * userWorkId : 1
         * power : 40
         * peopleId : 23
         * userProductionLineId : 2431
         * workPostId : 7
         */

        private int id;
        private int userWorkId;
        private int power;
        private int peopleId;
        private int userProductionLineId;
        private int workPostId;

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

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getPeopleId() {
            return peopleId;
        }

        public void setPeopleId(int peopleId) {
            this.peopleId = peopleId;
        }

        public int getUserProductionLineId() {
            return userProductionLineId;
        }

        public void setUserProductionLineId(int userProductionLineId) {
            this.userProductionLineId = userProductionLineId;
        }

        public int getWorkPostId() {
            return workPostId;
        }

        public void setWorkPostId(int workPostId) {
            this.workPostId = workPostId;
        }
    }
}
