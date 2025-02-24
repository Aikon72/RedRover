public class Test {

    public static void main(String[] args) {
        int seconds = 195555552;
        String time = "";
        if (seconds == 0){
            //return "now";
        }
        int tmp = seconds/24/3600/365;
        if (tmp > 0){
            time += tmp + " year";
            if (tmp > 1) {
                time += "s";
            }
            seconds = seconds % (365*24*3600);
        }
        tmp = seconds/24/3600;
        if (tmp > 0){
            if (time != "") {
                time += ", ";
            }
            time += tmp + " day";
            if (tmp > 1) {
                time += "s";
            }
            seconds = seconds % (24*3600);
        }
        tmp = seconds/3600;
        if (tmp > 0){
            if (time != "")  {
                time += ", ";
            }
            time += tmp + " hour";
            if (tmp > 1) {
                time += "s";
            }
            seconds = seconds % 3600;
        }
        tmp = seconds/60;
        if (tmp > 0){
            if (time != "")  {
                if (seconds % 60 == 0){
                    time += " and ";
                }else {
                    time += ", ";
                }
            }
            time += tmp + " minute";
            if (tmp > 1) {
                time += "s";
            }
            seconds = seconds % 60;
        }

        tmp = seconds;
        if (tmp > 0){
            if (time != "") {
                time += " and ";
            }
            time +=  tmp + " second";
            if (tmp > 1) {
                time += "s";
            }
        }
        System.out.println(time);
        //return time;

    }


}
