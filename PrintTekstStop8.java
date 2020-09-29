import java.io.PrintStream;

public class PrintTekstStop8 {
    public static void main(String[] args) {
        System.out.println("2a");

        System.out.println("    " + "*" + "     " + "*");
        System.out.println("     " + "*" + "   " + "*");
        System.out.println("      " + "*" + " " + "*");
        try (PrintStream oldOut = System.out) {
        }
        {
            System.out.println("     " + "*" + "   " + "*");
            System.out.println("    " + "*" + "     " + "*");
            System.out.println("   " + "*" + "       " + "*");
        }
    }
}
