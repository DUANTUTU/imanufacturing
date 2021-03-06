package RetrofitBean;

import java.util.List;

public class SuppierBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":1,"suppierName":"新星汽车配件","content":"新星汽车配件供货商"},{"id":2,"suppierName":"枫叶汽车配件","content":"枫叶汽车配件供货商"},{"id":5,"suppierName":"天辉汽车配件","content":"天辉汽车配件供货商"},{"id":6,"suppierName":"细末汽车配件","content":"细末汽车配件供货商"}]
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
         * suppierName : 新星汽车配件
         * content : 新星汽车配件供货商
         */

        private int id;
        private String suppierName;
        private String content;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSuppierName() {
            return suppierName;
        }

        public void setSuppierName(String suppierName) {
            this.suppierName = suppierName;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
