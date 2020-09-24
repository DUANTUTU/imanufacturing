package RetrofitBean;

/**
 * Created by Caleb.F
 * on 2020-03-01
 * at 16:04
 */
public class LightBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : {"id":1,"day":"3033","lightSwitch":"1","acOnOff":"2","beam":"100","workshopTemp":"30℃","outTemp":"20℃","power":"100","powerConsume":"39","time":"00:15"}
     */

    private int status;
    private String message;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * day : 3033
         * lightSwitch : 1
         * acOnOff : 2
         * beam : 100
         * workshopTemp : 30℃
         * outTemp : 20℃
         * power : 100
         * powerConsume : 39
         * time : 00:15
         */

        private int id;
        private String day;
        private String lightSwitch;
        private String acOnOff;
        private String beam;
        private String workshopTemp;
        private String outTemp;
        private String power;
        private String powerConsume;
        private String time;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getLightSwitch() {
            return lightSwitch;
        }

        public void setLightSwitch(String lightSwitch) {
            this.lightSwitch = lightSwitch;
        }

        public String getAcOnOff() {
            return acOnOff;
        }

        public void setAcOnOff(String acOnOff) {
            this.acOnOff = acOnOff;
        }

        public String getBeam() {
            return beam;
        }

        public void setBeam(String beam) {
            this.beam = beam;
        }

        public String getWorkshopTemp() {
            return workshopTemp;
        }

        public void setWorkshopTemp(String workshopTemp) {
            this.workshopTemp = workshopTemp;
        }

        public String getOutTemp() {
            return outTemp;
        }

        public void setOutTemp(String outTemp) {
            this.outTemp = outTemp;
        }

        public String getPower() {
            return power;
        }

        public void setPower(String power) {
            this.power = power;
        }

        public String getPowerConsume() {
            return powerConsume;
        }

        public void setPowerConsume(String powerConsume) {
            this.powerConsume = powerConsume;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", day='" + day + '\'' +
                    ", lightSwitch='" + lightSwitch + '\'' +
                    ", acOnOff='" + acOnOff + '\'' +
                    ", beam='" + beam + '\'' +
                    ", workshopTemp='" + workshopTemp + '\'' +
                    ", outTemp='" + outTemp + '\'' +
                    ", power='" + power + '\'' +
                    ", powerConsume='" + powerConsume + '\'' +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
}
