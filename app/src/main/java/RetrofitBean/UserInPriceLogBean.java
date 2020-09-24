package RetrofitBean;

import java.util.List;

public class UserInPriceLogBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":23,"userWorkId":1,"price":3000,"endPrice":14000,"time":"2019-12-18 14:30:00","type":5},{"id":24,"userWorkId":1,"price":4000,"endPrice":18000,"time":"2019-12-18 14:35:00","type":5},{"id":25,"userWorkId":1,"price":6000,"endPrice":24000,"time":"2019-12-18 14:45:00","type":5},{"id":26,"userWorkId":1,"price":2000,"endPrice":26000,"time":"2019-12-18 14:55:00","type":5},{"id":31,"userWorkId":1,"price":500,"endPrice":9500,"time":"2019-12-18 06:34:24","type":0}]
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
         * id : 23
         * userWorkId : 1
         * price : 3000
         * endPrice : 14000
         * time : 2019-12-18 14:30:00
         * type : 5
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
