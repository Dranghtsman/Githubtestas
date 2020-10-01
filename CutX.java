public class CutX {
    public static void main(String[] args) {

        String x1= "    "+"*" +"     "+"*";
        String x2= "     "+"*" +"   "+"*";
        String x3= "      "+"*" +" "+"*";
        String x4="      "+"*" +"   "+"*";
        String x5= "    "+"*" +"     "+"*";
        String x6= "   "+"*" +"       "+"*";

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4.substring(1,2));
        System.out.println(x5.substring(1,2));
        System.out.println(x6.substring(1,2));
    }
}
