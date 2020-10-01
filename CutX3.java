public class CutX3 {
    public static void main(String[] args) {
        int b;
        int Half;

        String x1 = "    " + "*" + "     " + "* ";
        String x2 = "     " + "*" + "   " + "* ";
        String x3 = "      " + "*" + " " + "* ";
        String x4 = "     " + "*" + "   " + "*";
        String x5 = "    " + "*" + "     " + "*";
        String x6 = "   " + "*" + "        " + "*";

        b = x1.length() + x2.length() + x3.length() + x4.length() + x5.length() + x6.length();

        Half = b / 2;

        System.out.println("All Simbol:" +b+" \n"+"Half Simbol: "+Half);
        {
        if (x1.length() + x2.length() == Half){

                System.out.println(x1 + "\n" + x2 );
    }
        else if  (x1.length() + x2.length() + x3.length()==Half) {
            System.out.println(x1 + "\n" + x2 + "\n" + x3);
        }

       else
                System.out.println(x1+"\n"+ x2+"\n" +x3+"\n"+x4);
        }
    }
}