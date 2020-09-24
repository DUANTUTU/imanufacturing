package RetrofitBean;

import java.util.List;

public class UserWorkEnvironmentalBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":1,"day":"1590","lightSwitch":0,"acOnOff":"0","beam":"245","workshopTemp":"41℃","outTemp":"36℃","power":"100","powerConsume":"48","time":"13:30"},{"id":2,"day":"0","lightSwitch":0,"acOnOff":"2","beam":"245","workshopTemp":"28c","outTemp":"35c","power":"100","powerConsume":"64","time":"12:30"}]
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
         * day : 1590
         * lightSwitch : 0
         * acOnOff : 0
         * beam : 245
         * workshopTemp : 41℃
         * outTemp : 36℃
         * power : 100
         * powerConsume : 48
         * time : 13:30
         */

        private int id;
        private String day;
        private int lightSwitch;
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

        public int getLightSwitch() {
            return lightSwitch;
        }

        public void setLightSwitch(int lightSwitch) {
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
    }
}
