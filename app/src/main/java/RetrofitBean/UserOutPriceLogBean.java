package RetrofitBean;

import java.util.List;

public class UserOutPriceLogBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":2,"userWorkId":1,"price":5000,"endPrice":45000,"time":"2019-12-18 10:10:00","type":0},{"id":3,"userWorkId":1,"price":2000,"endPrice":43000,"time":"2019-12-18 11:12:00","type":1},{"id":4,"userWorkId":1,"price":1000,"endPrice":42000,"time":"2019-12-18 11:30:00","type":2},{"id":5,"userWorkId":1,"price":6000,"endPrice":35000,"time":"2019-12-18 11:40:00","type":2},{"id":6,"userWorkId":1,"price":500,"endPrice":34500,"time":"2019-12-18 11:42:00","type":3},{"id":7,"userWorkId":1,"price":1500,"endPrice":33000,"time":"2019-12-18 11:45:00","type":3},{"id":8,"userWorkId":1,"price":500,"endPrice":34500,"time":"2019-12-18 11:55:00","type":3},{"id":9,"userWorkId":1,"price":1500,"endPrice":33000,"time":"2019-12-18 12:00:00","type":0},{"id":10,"userWorkId":1,"price":3000,"endPrice":30000,"time":"2019-12-18 12:20:00","type":0},{"id":11,"userWorkId":1,"price":2000,"endPrice":28000,"time":"2019-12-18 12:35:00","type":0},{"id":12,"userWorkId":1,"price":1000,"endPrice":27000,"time":"2019-12-18 12:55:00","type":4},{"id":13,"userWorkId":1,"price":1000,"endPrice":26000,"time":"2019-12-18 13:10:00","type":4},{"id":14,"userWorkId":1,"price":1000,"endPrice":25000,"time":"2019-12-18 13:20:00","type":4},{"id":15,"userWorkId":1,"price":1000,"endPrice":24500,"time":"2019-12-18 13:15:00","type":4},{"id":16,"userWorkId":1,"price":1000,"endPrice":24000,"time":"2019-12-18 13:30:00","type":4},{"id":17,"userWorkId":1,"price":500,"endPrice":23500,"time":"2019-12-18 13:40:00","type":4},{"id":18,"userWorkId":1,"price":500,"endPrice":23000,"time":"2019-12-18 13:45:00","type":4},{"id":19,"userWorkId":1,"price":3000,"endPrice":20000,"time":"2019-12-18 13:55:00","type":0},{"id":20,"userWorkId":1,"price":2000,"endPrice":18000,"time":"2019-12-18 14:00:00","type":0},{"id":21,"userWorkId":1,"price":3000,"endPrice":15000,"time":"2019-12-18 14:10:00","type":0},{"id":22,"userWorkId":1,"price":4000,"endPrice":11000,"time":"2019-12-18 14:15:00","type":0},{"id":27,"userWorkId":1,"price":6000,"endPrice":20000,"time":"2019-12-18 15:05:00","type":0},{"id":28,"userWorkId":1,"price":5000,"endPrice":15000,"time":"2019-12-18 15:55:00","type":1},{"id":29,"userWorkId":1,"price":3000,"endPrice":12000,"time":"2019-12-18 16:15:00","type":2},{"id":30,"userWorkId":1,"price":2000,"endPrice":10000,"time":"2019-12-18 16:30:00","type":2},{"id":32,"userWorkId":1,"price":3000,"endPrice":12500,"time":"2019-12-18 01:37:48","type":5}]
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
         * id : 2
         * userWorkId : 1
         * price : 5000
         * endPrice : 45000
         * time : 2019-12-18 10:10:00
         * type : 0
         */

        private int id;
        private int userWorkId;
        private int price;
        private int endPrice;
        private String time;
        private int type;

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

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getEndPrice() {
            return endPrice;
        }

        public void setEndPrice(int endPrice) {
            this.endPrice = endPrice;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
