package RetrofitBean;

import java.util.List;

public class UserWorkEnvironmentalLogBean {


    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":2,"userWorkId":1,"day":"1","lightSwitch":1,"acOnOff":1,"beam":1,"workshopTemp":null,"outTemp":"1","power":1,"powerConsume":"1","time":"1"},{"id":3,"userWorkId":null,"day":null,"lightSwitch":null,"acOnOff":null,"beam":null,"workshopTemp":null,"outTemp":null,"power":null,"powerConsume":null,"time":null}]
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
         * day : 1
         * lightSwitch : 1
         * acOnOff : 1
         * beam : 1
         * workshopTemp : null
         * outTemp : 1
         * power : 1
         * powerConsume : 1
         * time : 1
         */

        private int id;
        private int userWorkId;
        private String day;
        private int lightSwitch;
        private int acOnOff;
        private int beam;
        private Object workshopTemp;
        private String outTemp;
        private int power;
        private String powerConsume;
        private String time;

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

        public int getAcOnOff() {
            return acOnOff;
        }

        public void setAcOnOff(int acOnOff) {
            this.acOnOff = acOnOff;
        }

        public int getBeam() {
            return beam;
        }

        public void setBeam(int beam) {
            this.beam = beam;
        }

        public Object getWorkshopTemp() {
            return workshopTemp;
        }

        public void setWorkshopTemp(Object workshopTemp) {
            this.workshopTemp = workshopTemp;
        }

        public String getOutTemp() {
            return outTemp;
        }

        public void setOutTemp(String outTemp) {
            this.outTemp = outTemp;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
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
