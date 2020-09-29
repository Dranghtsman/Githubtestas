import java.util.Locale;

public class BigLetter {
        public static void main (String [] args){


            char [] letter = {'t', 'a', 'D', 'a', 'S' };
            String str = new String(letter);

            System.out.println("Big Letter: "+str.toUpperCase());
            System.out.println("Small Letter: "+str.toLowerCase());
        }
}