package RetrofitBean;

import java.util.List;

public class TalentMarketBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":1,"talentMarketName":"汽车员工招聘中心","content":"汽车员工招聘中心"}]
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
         * talentMarketName : 汽车员工招聘中心
         * content : 汽车员工招聘中心
         */

        private int id;
        private String talentMarketName;
        private String content;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTalentMarketName() {
            return talentMarketName;
        }

        public void setTalentMarketName(String talentMarketName) {
            this.talentMarketName = talentMarketName;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
