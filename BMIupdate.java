import java.util.Scanner;

public class BMIupdate {
    public static void  main(String[] args) {

        String Name1;
        String Name2;
        float Height;
        float Height2;
        int Weight ;
        int Weight2;
        Scanner input = new Scanner(System.in);
        {

            System.out.println("Enter Your Name ");
            while (!input.hasNextLine()) {

                input.next();
            }
            Name1 = input.nextLine();
            {
                System.out.println("Enter Your Name2 ");
                Name2 = input.nextLine();


                System.out.println("Yuor Name : " + Name1 + "  "+"Yuor Name2 : " + Name2);


                do {
                    System.out.println("Enter Height (cm) :"+Name1);
                    while (!input.hasNextFloat()) {
                        System.out.println("That's not a number!");
                        input.next();
                    }
                    Height = input.nextFloat();
                } while (Height <= 0 || Height > 240);

                System.out.println("Your Height "+Name1 +"=" + Height);
                do {
                    System.out.println("Enter Height (cm):"+Name2);
                    while (!input.hasNextFloat()) {
                        System.out.println("That's not a number!");

                        input.next();
                    }
                    Height2 = input.nextFloat();
                }
                while (Height2 < 0 || Height2 > 240);
                {
                    System.out.println("Your Height "+Name2 +"="+ Height2);
                }




            do {


                {  System.out.println("Enter Your Weight :"+Name1);
                } while (!input.hasNextInt()) {
                    System.out.println("That's not a number!");

                    input.next();
                }
                Weight = input.nextInt();
            } while (Weight <0 || Weight > 240);

            System.out.println("Your Weight  " + Name1 +"="+ Weight);

            do {


                {  System.out.println("Enter Your Weight : "+Name2);
                } while (!input.hasNextInt()) {
                    System.out.println("That's not a number!");

                    input.next();
                }
                Weight2 = input.nextInt();
            } while (Weight2< 0 || Weight2 > 240); {

            System.out.println("Your Weight " + Name2 +"="+ Weight2);
        }



            input.close();// Closes the scanner


            float BMI = (Weight * Weight) / Height;
            System.out.println();
            if (BMI>24.9 || BMI<18.4)

                System.out.print(Name1+":"+"no optimal ");

            else
                System.out.print(Name1+":"+" optimal ");

            float BMI2=(Weight2*Weight2)/Height2;
            if (BMI2>24.9 || BMI2<18.4)

                System.out.print("           "+Name2+":"+" no optimal ");

            else
                System.out.print("           "+Name2+":"+"optimal ");

            System.out.println("\nBody Index: "+Name1 + BMI+"  "+"Body Index: " +Name2+BMI2 + "\nHeight :" +
                    Height+"               "+"Height :"+ Height2+ "\nWeight (Kg) :" + Weight+"             "+"Weight (Kg) :"+Weight2);


        }}}}
