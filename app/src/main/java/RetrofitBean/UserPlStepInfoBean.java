package RetrofitBean;

import java.util.List;

public class UserPlStepInfoBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":6988,"plStepName":"轿车车型生产环节20","stageId":44,"power":100,"costTime":"0","step":20,"consume":30},{"id":6987,"plStepName":"轿车车型生产环节19","stageId":43,"power":100,"costTime":"0","step":19,"consume":30},{"id":6986,"plStepName":"轿车车型生产环节18","stageId":42,"power":100,"costTime":"0","step":18,"consume":30},{"id":6985,"plStepName":"轿车车型生产环节17","stageId":41,"power":100,"costTime":"0","step":17,"consume":30},{"id":6984,"plStepName":"轿车车型生产环节16","stageId":40,"power":2,"costTime":"0","step":16,"consume":30},{"id":6983,"plStepName":"轿车车型生产环节15","stageId":39,"power":100,"costTime":"0","step":15,"consume":30},{"id":6982,"plStepName":"轿车车型生产环节14","stageId":38,"power":100,"costTime":"0","step":14,"consume":30},{"id":6981,"plStepName":"轿车车型生产环节13","stageId":37,"power":100,"costTime":"0","step":13,"consume":30},{"id":6980,"plStepName":"轿车车型生产环节12","stageId":36,"power":100,"costTime":"0","step":12,"consume":30},{"id":6979,"plStepName":"轿车车型生产环节11","stageId":35,"power":100,"costTime":"0","step":11,"consume":30},{"id":6978,"plStepName":"轿车车型生产环节10","stageId":34,"power":100,"costTime":"0","step":10,"consume":30},{"id":6977,"plStepName":"轿车车型生产环节9","stageId":33,"power":100,"costTime":"0","step":9,"consume":30},{"id":6976,"plStepName":"轿车车型生产环节8","stageId":31,"power":100,"costTime":"0","step":8,"consume":30},{"id":6975,"plStepName":"轿车车型生产环节7","stageId":32,"power":4,"costTime":"0","step":7,"consume":30},{"id":6974,"plStepName":"轿车车型生产环节6","stageId":30,"power":100,"costTime":"0","step":6,"consume":30},{"id":6973,"plStepName":"轿车车型生产环节5","stageId":29,"power":3,"costTime":"0","step":5,"consume":30},{"id":6972,"plStepName":"轿车车型生产环节4","stageId":28,"power":100,"costTime":"0","step":4,"consume":30},{"id":6971,"plStepName":"轿车车型生产环节3","stageId":27,"power":100,"costTime":"0","step":3,"consume":30},{"id":6970,"plStepName":"轿车车型生产环节2","stageId":26,"power":100,"costTime":"0","step":2,"consume":30},{"id":6969,"plStepName":"轿车车型生产环节1","stageId":25,"power":70,"costTime":"0","step":1,"consume":30},{"id":6968,"plStepName":"SUV车型生产环节20","stageId":64,"power":100,"costTime":"0","step":20,"consume":30},{"id":6967,"plStepName":"SUV车型生产环节19","stageId":63,"power":100,"costTime":"0","step":19,"consume":30},{"id":6966,"plStepName":"SUV车型生产环节18","stageId":62,"power":100,"costTime":"0","step":18,"consume":30},{"id":6965,"plStepName":"SUV车型生产环节17","stageId":61,"power":100,"costTime":"0","step":17,"consume":30},{"id":6964,"plStepName":"SUV车型生产环节16","stageId":60,"power":100,"costTime":"0","step":16,"consume":30},{"id":6963,"plStepName":"SUV车型生产环节15","stageId":59,"power":100,"costTime":"0","step":15,"consume":30},{"id":6962,"plStepName":"SUV车型生产环节14","stageId":58,"power":100,"costTime":"0","step":14,"consume":30},{"id":6961,"plStepName":"SUV车型生产环节13","stageId":57,"power":100,"costTime":"0","step":13,"consume":30},{"id":6960,"plStepName":"SUV车型生产环节12","stageId":56,"power":100,"costTime":"0","step":12,"consume":30},{"id":6959,"plStepName":"SUV车型生产环节11","stageId":55,"power":100,"costTime":"0","step":11,"consume":30},{"id":6958,"plStepName":"SUV车型生产环节10","stageId":54,"power":100,"costTime":"0","step":10,"consume":30},{"id":6957,"plStepName":"SUV车型生产环节9","stageId":53,"power":100,"costTime":"0","step":9,"consume":30},{"id":6956,"plStepName":"SUV车型生产环节8","stageId":51,"power":100,"costTime":"0","step":8,"consume":30},{"id":6955,"plStepName":"SUV车型生产环节7","stageId":52,"power":100,"costTime":"0","step":7,"consume":30},{"id":6954,"plStepName":"SUV车型生产环节6","stageId":50,"power":100,"costTime":"0","step":6,"consume":30},{"id":6953,"plStepName":"SUV车型生产环节5","stageId":49,"power":1,"costTime":"0","step":5,"consume":30},{"id":6952,"plStepName":"SUV车型生产环节4","stageId":48,"power":100,"costTime":"0","step":4,"consume":30},{"id":6951,"plStepName":"SUV车型生产环节3","stageId":47,"power":100,"costTime":"0","step":3,"consume":30},{"id":6950,"plStepName":"SUV车型生产环节2","stageId":46,"power":100,"costTime":"0","step":2,"consume":30},{"id":6949,"plStepName":"SUV车型生产环节1","stageId":45,"power":100,"costTime":"0","step":1,"consume":30},{"id":6948,"plStepName":"轿车车型生产环节20","stageId":44,"power":100,"costTime":"0","step":20,"consume":30},{"id":6947,"plStepName":"轿车车型生产环节19","stageId":43,"power":100,"costTime":"0","step":19,"consume":30},{"id":6946,"plStepName":"轿车车型生产环节18","stageId":42,"power":20,"costTime":"0","step":18,"consume":30},{"id":6945,"plStepName":"轿车车型生产环节17","stageId":41,"power":100,"costTime":"0","step":17,"consume":30},{"id":6944,"plStepName":"轿车车型生产环节16","stageId":40,"power":100,"costTime":"0","step":16,"consume":30},{"id":6943,"plStepName":"轿车车型生产环节15","stageId":39,"power":100,"costTime":"0","step":15,"consume":30},{"id":6942,"plStepName":"轿车车型生产环节14","stageId":38,"power":100,"costTime":"0","step":14,"consume":30},{"id":6941,"plStepName":"轿车车型生产环节13","stageId":37,"power":100,"costTime":"0","step":13,"consume":30},{"id":6940,"plStepName":"轿车车型生产环节12","stageId":36,"power":100,"costTime":"0","step":12,"consume":30},{"id":6939,"plStepName":"轿车车型生产环节11","stageId":35,"power":0,"costTime":"0","step":11,"consume":30},{"id":6938,"plStepName":"轿车车型生产环节10","stageId":34,"power":100,"costTime":"0","step":10,"consume":30},{"id":6937,"plStepName":"轿车车型生产环节9","stageId":33,"power":100,"costTime":"0","step":9,"consume":30},{"id":6936,"plStepName":"轿车车型生产环节8","stageId":31,"power":100,"costTime":"0","step":8,"consume":30},{"id":6935,"plStepName":"轿车车型生产环节7","stageId":32,"power":100,"costTime":"0","step":7,"consume":30},{"id":6934,"plStepName":"轿车车型生产环节6","stageId":30,"power":100,"costTime":"0","step":6,"consume":30},{"id":6933,"plStepName":"轿车车型生产环节5","stageId":29,"power":100,"costTime":"0","step":5,"consume":30},{"id":6932,"plStepName":"轿车车型生产环节4","stageId":28,"power":100,"costTime":"0","step":4,"consume":30},{"id":6931,"plStepName":"轿车车型生产环节3","stageId":27,"power":100,"costTime":"0","step":3,"consume":30},{"id":6929,"plStepName":"轿车车型生产环节1","stageId":25,"power":100,"costTime":"0","step":1,"consume":30},{"id":6930,"plStepName":"轿车车型生产环节2","stageId":26,"power":100,"costTime":"0","step":2,"consume":30},{"id":20108,"plStepName":"MPV车型生产环节20","stageId":24,"power":100,"costTime":"0","step":20,"consume":30},{"id":20107,"plStepName":"MPV车型生产环节19","stageId":23,"power":100,"costTime":"0","step":19,"consume":30},{"id":20106,"plStepName":"MPV车型生产环节18","stageId":22,"power":100,"costTime":"0","step":18,"consume":30},{"id":20105,"plStepName":"MPV车型生产环节17","stageId":21,"power":100,"costTime":"0","step":17,"consume":30},{"id":20104,"plStepName":"MPV车型生产环节16","stageId":20,"power":100,"costTime":"0","step":16,"consume":30},{"id":20103,"plStepName":"MPV车型生产环节15","stageId":19,"power":100,"costTime":"0","step":15,"consume":30},{"id":20102,"plStepName":"MPV车型生产环节14","stageId":18,"power":0,"costTime":"0","step":14,"consume":30},{"id":20101,"plStepName":"MPV车型生产环节13","stageId":17,"power":100,"costTime":"0","step":13,"consume":30},{"id":20100,"plStepName":"MPV车型生产环节12","stageId":16,"power":100,"costTime":"0","step":12,"consume":30},{"id":20099,"plStepName":"MPV车型生产环节11","stageId":15,"power":100,"costTime":"0","step":11,"consume":30},{"id":20098,"plStepName":"MPV车型生产环节10","stageId":14,"power":100,"costTime":"0","step":10,"consume":30},{"id":20097,"plStepName":"MPV车型生产环节9","stageId":13,"power":100,"costTime":"0","step":9,"consume":30},{"id":20096,"plStepName":"MPV车型生产环节8","stageId":11,"power":100,"costTime":"0","step":8,"consume":30},{"id":20095,"plStepName":"MPV车型生产环节7","stageId":12,"power":100,"costTime":"0","step":7,"consume":30},{"id":20094,"plStepName":"MPV车型生产环节6","stageId":10,"power":100,"costTime":"0","step":6,"consume":30},{"id":20093,"plStepName":"MPV车型生产环节5","stageId":9,"power":100,"costTime":"0","step":5,"consume":30},{"id":20092,"plStepName":"MPV车型生产环节4","stageId":8,"power":100,"costTime":"0","step":4,"consume":30},{"id":20091,"plStepName":"MPV车型生产环节3","stageId":7,"power":100,"costTime":"0","step":3,"consume":30},{"id":20090,"plStepName":"MPV车型生产环节2","stageId":6,"power":10,"costTime":"0","step":2,"consume":30},{"id":20089,"plStepName":"MPV车型生产环节1","stageId":5,"power":100,"costTime":"0","step":1,"consume":30},{"id":20088,"plStepName":"轿车车型生产环节20","stageId":44,"power":100,"costTime":"0","step":20,"consume":30},{"id":20087,"plStepName":"轿车车型生产环节19","stageId":43,"power":100,"costTime":"0","step":19,"consume":30},{"id":20086,"plStepName":"轿车车型生产环节18","stageId":42,"power":100,"costTime":"0","step":18,"consume":30},{"id":20085,"plStepName":"轿车车型生产环节17","stageId":41,"power":100,"costTime":"0","step":17,"consume":30},{"id":20084,"plStepName":"轿车车型生产环节16","stageId":40,"power":100,"costTime":"0","step":16,"consume":30},{"id":20083,"plStepName":"轿车车型生产环节15","stageId":39,"power":100,"costTime":"0","step":15,"consume":30},{"id":20082,"plStepName":"轿车车型生产环节14","stageId":38,"power":100,"costTime":"0","step":14,"consume":30},{"id":20081,"plStepName":"轿车车型生产环节13","stageId":37,"power":100,"costTime":"0","step":13,"consume":30},{"id":20080,"plStepName":"轿车车型生产环节12","stageId":36,"power":100,"costTime":"0","step":12,"consume":30},{"id":20079,"plStepName":"轿车车型生产环节11","stageId":35,"power":100,"costTime":"0","step":11,"consume":30},{"id":20078,"plStepName":"轿车车型生产环节10","stageId":34,"power":100,"costTime":"0","step":10,"consume":30},{"id":20077,"plStepName":"轿车车型生产环节9","stageId":33,"power":100,"costTime":"0","step":9,"consume":30},{"id":20076,"plStepName":"轿车车型生产环节8","stageId":31,"power":100,"costTime":"0","step":8,"consume":30},{"id":20075,"plStepName":"轿车车型生产环节7","stageId":32,"power":100,"costTime":"0","step":7,"consume":30},{"id":20074,"plStepName":"轿车车型生产环节6","stageId":30,"power":100,"costTime":"0","step":6,"consume":30},{"id":20073,"plStepName":"轿车车型生产环节5","stageId":29,"power":70,"costTime":"0","step":5,"consume":30},{"id":20072,"plStepName":"轿车车型生产环节4","stageId":28,"power":70,"costTime":"0","step":4,"consume":30},{"id":20071,"plStepName":"轿车车型生产环节3","stageId":27,"power":70,"costTime":"0","step":3,"consume":30},{"id":20070,"plStepName":"轿车车型生产环节2","stageId":26,"power":70,"costTime":"0","step":2,"consume":30},{"id":20069,"plStepName":"轿车车型生产环节1","stageId":25,"power":70,"costTime":"0","step":1,"consume":30},{"id":20109,"plStepName":"轿车车型生产环节1","stageId":25,"power":100,"costTime":"0","step":1,"consume":30},{"id":20110,"plStepName":"轿车车型生产环节2","stageId":26,"power":100,"costTime":"0","step":2,"consume":30},{"id":20111,"plStepName":"轿车车型生产环节3","stageId":27,"power":100,"costTime":"0","step":3,"consume":30},{"id":20112,"plStepName":"轿车车型生产环节4","stageId":28,"power":100,"costTime":"0","step":4,"consume":30},{"id":20113,"plStepName":"轿车车型生产环节5","stageId":29,"power":100,"costTime":"0","step":5,"consume":30},{"id":20114,"plStepName":"轿车车型生产环节6","stageId":30,"power":100,"costTime":"0","step":6,"consume":30},{"id":20115,"plStepName":"轿车车型生产环节7","stageId":32,"power":100,"costTime":"0","step":7,"consume":30},{"id":20116,"plStepName":"轿车车型生产环节8","stageId":31,"power":100,"costTime":"0","step":8,"consume":30},{"id":20117,"plStepName":"轿车车型生产环节9","stageId":33,"power":100,"costTime":"0","step":9,"consume":30},{"id":20118,"plStepName":"轿车车型生产环节10","stageId":34,"power":100,"costTime":"0","step":10,"consume":30},{"id":20119,"plStepName":"轿车车型生产环节11","stageId":35,"power":100,"costTime":"0","step":11,"consume":30},{"id":20120,"plStepName":"轿车车型生产环节12","stageId":36,"power":100,"costTime":"0","step":12,"consume":30},{"id":20121,"plStepName":"轿车车型生产环节13","stageId":37,"power":100,"costTime":"0","step":13,"consume":30},{"id":20122,"plStepName":"轿车车型生产环节14","stageId":38,"power":100,"costTime":"0","step":14,"consume":30},{"id":20123,"plStepName":"轿车车型生产环节15","stageId":39,"power":100,"costTime":"0","step":15,"consume":30},{"id":20124,"plStepName":"轿车车型生产环节16","stageId":40,"power":100,"costTime":"0","step":16,"consume":30},{"id":20125,"plStepName":"轿车车型生产环节17","stageId":41,"power":100,"costTime":"0","step":17,"consume":30},{"id":20126,"plStepName":"轿车车型生产环节18","stageId":42,"power":100,"costTime":"0","step":18,"consume":30},{"id":20127,"plStepName":"轿车车型生产环节19","stageId":43,"power":100,"costTime":"0","step":19,"consume":30},{"id":20128,"plStepName":"轿车车型生产环节20","stageId":44,"power":100,"costTime":"0","step":20,"consume":30},{"id":20129,"plStepName":"MPV车型生产环节1","stageId":5,"power":100,"costTime":"0","step":1,"consume":30},{"id":20130,"plStepName":"MPV车型生产环节2","stageId":6,"power":100,"costTime":"0","step":2,"consume":30},{"id":20131,"plStepName":"MPV车型生产环节3","stageId":7,"power":100,"costTime":"0","step":3,"consume":30},{"id":20132,"plStepName":"MPV车型生产环节4","stageId":8,"power":100,"costTime":"0","step":4,"consume":30},{"id":20133,"plStepName":"MPV车型生产环节5","stageId":9,"power":100,"costTime":"0","step":5,"consume":30},{"id":20134,"plStepName":"MPV车型生产环节6","stageId":10,"power":100,"costTime":"0","step":6,"consume":30},{"id":20135,"plStepName":"MPV车型生产环节7","stageId":12,"power":100,"costTime":"0","step":7,"consume":30},{"id":20136,"plStepName":"MPV车型生产环节8","stageId":11,"power":100,"costTime":"0","step":8,"consume":30},{"id":20137,"plStepName":"MPV车型生产环节9","stageId":13,"power":100,"costTime":"0","step":9,"consume":30},{"id":20138,"plStepName":"MPV车型生产环节10","stageId":14,"power":100,"costTime":"0","step":10,"consume":30},{"id":20139,"plStepName":"MPV车型生产环节11","stageId":15,"power":100,"costTime":"0","step":11,"consume":30},{"id":20140,"plStepName":"MPV车型生产环节12","stageId":16,"power":100,"costTime":"0","step":12,"consume":30},{"id":20141,"plStepName":"MPV车型生产环节13","stageId":17,"power":100,"costTime":"0","step":13,"consume":30},{"id":20142,"plStepName":"MPV车型生产环节14","stageId":18,"power":100,"costTime":"0","step":14,"consume":30},{"id":20143,"plStepName":"MPV车型生产环节15","stageId":19,"power":100,"costTime":"0","step":15,"consume":30},{"id":20144,"plStepName":"MPV车型生产环节16","stageId":20,"power":100,"costTime":"0","step":16,"consume":30},{"id":20145,"plStepName":"MPV车型生产环节17","stageId":21,"power":100,"costTime":"0","step":17,"consume":30},{"id":20146,"plStepName":"MPV车型生产环节18","stageId":22,"power":100,"costTime":"0","step":18,"consume":30},{"id":20147,"plStepName":"MPV车型生产环节19","stageId":23,"power":100,"costTime":"0","step":19,"consume":30},{"id":20148,"plStepName":"MPV车型生产环节20","stageId":24,"power":100,"costTime":"0","step":20,"consume":30}]
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
         * id : 6988
         * plStepName : 轿车车型生产环节20
         * stageId : 44
         * power : 100
         * costTime : 0
         * step : 20
         * consume : 30
         */

        private int id;
        private String plStepName;
        private int stageId;
        private int power;
        private String costTime;
        private int step;
        private int consume;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPlStepName() {
            return plStepName;
        }

        public void setPlStepName(String plStepName) {
            this.plStepName = plStepName;
        }

        public int getStageId() {
            return stageId;
        }

        public void setStageId(int stageId) {
            this.stageId = stageId;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public String getCostTime() {
            return costTime;
        }

        public void setCostTime(String costTime) {
            this.costTime = costTime;
        }

        public int getStep() {
            return step;
        }

        public void setStep(int step) {
            this.step = step;
        }

        public int getConsume() {
            return consume;
        }

        public void setConsume(int consume) {
            this.consume = consume;
        }
    }
}
