package RetrofitBean;

import java.util.List;

public class UserSellOutLogBean {

    /**
     * status : 200
     * message : SUCCESS
     * data : [{"id":138,"userWorkId":2,"carId":1,"gold":100,"time":1570188639,"num":1},{"id":17389,"userWorkId":1,"carId":2,"gold":800,"time":1576135879,"num":5},{"id":17388,"userWorkId":1,"carId":3,"gold":500,"time":1574452584,"num":10},{"id":17387,"userWorkId":1,"carId":2,"gold":1567,"time":1570112584,"num":1},{"id":17386,"userWorkId":1,"carId":1,"gold":2666,"time":1570236932,"num":1},{"id":17385,"userWorkId":1,"carId":2,"gold":1600,"time":1576703568,"num":1},{"id":17384,"userWorkId":1,"carId":1,"gold":1500,"time":1575215879,"num":5},{"id":17383,"userWorkId":1,"carId":2,"gold":896,"time":1571211111,"num":5},{"id":17382,"userWorkId":1,"carId":2,"gold":1500,"time":1570101258,"num":3},{"id":17381,"userWorkId":1,"carId":3,"gold":2000,"time":1570610147,"num":2},{"id":17380,"userWorkId":1,"carId":1,"gold":1396,"time":1570512547,"num":5},{"id":17379,"userWorkId":1,"carId":2,"gold":136,"time":1570332589,"num":20},{"id":17378,"userWorkId":1,"carId":3,"gold":1555,"time":1576425879,"num":2},{"id":17377,"userWorkId":1,"carId":1,"gold":1000,"time":1574512584,"num":5},{"id":17376,"userWorkId":1,"carId":2,"gold":1002,"time":1570512584,"num":5},{"id":17375,"userWorkId":1,"carId":1,"gold":259,"time":1570356932,"num":10},{"id":17374,"userWorkId":1,"carId":2,"gold":920,"time":1576796742,"num":5},{"id":17373,"userWorkId":1,"carId":1,"gold":100,"time":1575237888,"num":1},{"id":17372,"userWorkId":1,"carId":1,"gold":363,"time":1571273888,"num":1},{"id":17371,"userWorkId":1,"carId":3,"gold":588,"time":1570136120,"num":1},{"id":17370,"userWorkId":1,"carId":3,"gold":1800,"time":1570635120,"num":1},{"id":17369,"userWorkId":1,"carId":1,"gold":1533,"time":1570535840,"num":2},{"id":17368,"userWorkId":1,"carId":3,"gold":1266,"time":1570343085,"num":2},{"id":17367,"userWorkId":1,"carId":3,"gold":1525,"time":1576452058,"num":5},{"id":17366,"userWorkId":1,"carId":3,"gold":2000,"time":1574534059,"num":2},{"id":17365,"userWorkId":1,"carId":2,"gold":1852,"time":1570578909,"num":2},{"id":17364,"userWorkId":1,"carId":3,"gold":2229,"time":1570356239,"num":1},{"id":17363,"userWorkId":1,"carId":2,"gold":960,"time":1576769321,"num":15},{"id":17362,"userWorkId":1,"carId":1,"gold":456,"time":1575233214,"num":7},{"id":17361,"userWorkId":1,"carId":1,"gold":3600,"time":1571278234,"num":1},{"id":17360,"userWorkId":1,"carId":3,"gold":5858,"time":1570159678,"num":1},{"id":17359,"userWorkId":1,"carId":3,"gold":800,"time":1570646989,"num":3},{"id":17358,"userWorkId":1,"carId":1,"gold":133,"time":1570545839,"num":25},{"id":17357,"userWorkId":1,"carId":3,"gold":1266,"time":1570345639,"num":6},{"id":17356,"userWorkId":1,"carId":1,"gold":1225,"time":1576456639,"num":5},{"id":17355,"userWorkId":1,"carId":3,"gold":200,"time":1574535569,"num":20},{"id":17354,"userWorkId":1,"carId":2,"gold":1562,"time":1570557339,"num":2},{"id":17353,"userWorkId":1,"carId":1,"gold":2569,"time":1570345239,"num":1},{"id":17352,"userWorkId":1,"carId":1,"gold":293,"time":1576789321,"num":1},{"id":17351,"userWorkId":1,"carId":2,"gold":258,"time":1574133214,"num":7},{"id":17350,"userWorkId":1,"carId":1,"gold":205,"time":1571231234,"num":13},{"id":17349,"userWorkId":1,"carId":1,"gold":725,"time":1570125678,"num":2},{"id":17348,"userWorkId":1,"carId":3,"gold":1200,"time":1570646789,"num":15},{"id":17347,"userWorkId":1,"carId":1,"gold":158,"time":1570553839,"num":5},{"id":17346,"userWorkId":1,"carId":3,"gold":1266,"time":1570343239,"num":6},{"id":17345,"userWorkId":1,"carId":3,"gold":1205,"time":1576443639,"num":10},{"id":17344,"userWorkId":1,"carId":2,"gold":200,"time":1574552569,"num":10},{"id":17343,"userWorkId":1,"carId":1,"gold":152,"time":1570567339,"num":1},{"id":17342,"userWorkId":1,"carId":1,"gold":236,"time":1570355239,"num":10},{"id":17341,"userWorkId":1,"carId":1,"gold":666,"time":1570456321,"num":3},{"id":17340,"userWorkId":1,"carId":2,"gold":288,"time":1570223214,"num":7},{"id":17339,"userWorkId":1,"carId":1,"gold":200,"time":1570321234,"num":3},{"id":17338,"userWorkId":1,"carId":3,"gold":720,"time":1570235678,"num":2},{"id":17337,"userWorkId":1,"carId":3,"gold":1080,"time":1570356789,"num":6},{"id":17336,"userWorkId":1,"carId":3,"gold":1808,"time":1570567839,"num":5},{"id":17335,"userWorkId":1,"carId":2,"gold":1262,"time":1570321239,"num":4},{"id":17334,"userWorkId":1,"carId":2,"gold":360,"time":1570355639,"num":10},{"id":17333,"userWorkId":1,"carId":2,"gold":7200,"time":1573452569,"num":1},{"id":17332,"userWorkId":1,"carId":2,"gold":1555,"time":1570567339,"num":1},{"id":17331,"userWorkId":1,"carId":1,"gold":2666,"time":1570356239,"num":1},{"id":17330,"userWorkId":1,"carId":3,"gold":488,"time":1570412439,"num":3},{"id":17329,"userWorkId":1,"carId":3,"gold":355,"time":1570229643,"num":5},{"id":17328,"userWorkId":1,"carId":1,"gold":1000,"time":1570323239,"num":1},{"id":17327,"userWorkId":1,"carId":3,"gold":769,"time":1570232979,"num":2},{"id":17326,"userWorkId":1,"carId":3,"gold":876,"time":1570354589,"num":30},{"id":17325,"userWorkId":1,"carId":1,"gold":1366,"time":1570236839,"num":25},{"id":17324,"userWorkId":1,"carId":2,"gold":1280,"time":1570371239,"num":4},{"id":17323,"userWorkId":1,"carId":2,"gold":3868,"time":1570357839,"num":20},{"id":17322,"userWorkId":1,"carId":1,"gold":780,"time":1570362569,"num":13},{"id":17321,"userWorkId":1,"carId":1,"gold":750,"time":1570324339,"num":6},{"id":17320,"userWorkId":1,"carId":3,"gold":2500,"time":1570352239,"num":8},{"id":17319,"userWorkId":1,"carId":3,"gold":400,"time":1570423439,"num":5},{"id":17318,"userWorkId":1,"carId":3,"gold":3555,"time":1570226543,"num":3},{"id":17317,"userWorkId":1,"carId":1,"gold":333,"time":1570352239,"num":15},{"id":17316,"userWorkId":1,"carId":3,"gold":221,"time":1570232239,"num":10},{"id":17315,"userWorkId":1,"carId":3,"gold":830,"time":1570354239,"num":3},{"id":17314,"userWorkId":1,"carId":1,"gold":1360,"time":1570232239,"num":7},{"id":17313,"userWorkId":1,"carId":2,"gold":1580,"time":1570372239,"num":5},{"id":17312,"userWorkId":1,"carId":2,"gold":3888,"time":1570352239,"num":6},{"id":17311,"userWorkId":1,"carId":1,"gold":750,"time":1570362339,"num":6},{"id":17310,"userWorkId":1,"carId":1,"gold":700,"time":1570325239,"num":2},{"id":17309,"userWorkId":1,"carId":3,"gold":1500,"time":1570342239,"num":1},{"id":17308,"userWorkId":1,"carId":1,"gold":600,"time":1570692060,"num":2},{"id":17307,"userWorkId":1,"carId":3,"gold":4000,"time":1570323439,"num":5},{"id":17306,"userWorkId":1,"carId":3,"gold":3500,"time":1570326543,"num":3},{"id":17305,"userWorkId":1,"carId":1,"gold":300,"time":1570332239,"num":8},{"id":17304,"userWorkId":1,"carId":3,"gold":200,"time":1570372239,"num":1},{"id":17303,"userWorkId":1,"carId":3,"gold":800,"time":1570352239,"num":2},{"id":17302,"userWorkId":1,"carId":1,"gold":1600,"time":1570222239,"num":6},{"id":17301,"userWorkId":1,"carId":2,"gold":1400,"time":1570352239,"num":6},{"id":17300,"userWorkId":1,"carId":2,"gold":3000,"time":1570312239,"num":2},{"id":17299,"userWorkId":1,"carId":1,"gold":700,"time":1570322339,"num":3},{"id":17298,"userWorkId":1,"carId":1,"gold":600,"time":1570325239,"num":5},{"id":17297,"userWorkId":1,"carId":3,"gold":2500,"time":1570312239,"num":5},{"id":17296,"userWorkId":1,"carId":3,"gold":2500,"time":1570322239,"num":10},{"id":17295,"userWorkId":1,"carId":1,"gold":1500,"time":1570311239,"num":5},{"id":17294,"userWorkId":1,"carId":2,"gold":500,"time":1570611239,"num":2},{"id":17293,"userWorkId":1,"carId":1,"gold":100,"time":1570611239,"num":2},{"id":17292,"userWorkId":1,"carId":3,"gold":500,"time":1570638239,"num":6},{"id":17291,"userWorkId":1,"carId":2,"gold":200,"time":1570628239,"num":2},{"id":17290,"userWorkId":1,"carId":1,"gold":100,"time":1570681239,"num":1}]
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
         * id : 138
         * userWorkId : 2
         * carId : 1
         * gold : 100
         * time : 1570188639
         * num : 1
         */

        private int id;
        private int userWorkId;
        private int carId;
        private int gold;
        private int time;
        private int num;

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

        public int getCarId() {
            return carId;
        }

        public void setCarId(int carId) {
            this.carId = carId;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
