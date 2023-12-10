import java.util.Scanner;



public class HW_Q1 {
    public static void inputAllBaseType() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter an  number?! ");
        int intno=sc.nextInt();
        System.out.println("The  Number is: "+intno);

        System.out.println("Is studying information technology fun?!");
        boolean bool=sc.nextBoolean();
        System.out.println("The boolean Value is: "+bool);

        System.out.println("Enter The Float Number?!");
        Float fl=sc.nextFloat();
        System.out.println("The Float Number is: "+fl);

        System.out.println("Enter The Short Value?!");
        Short sh=sc.nextShort();
        System.out.println("The Short Value is: "+sh);

        System.out.println("Enter The Long Value?!");
        Long lo=sc.nextLong();
        System.out.println("The Long Value is: "+sh);


        System.out.println("Enter The Double Number?!");
        double ff=sc.nextDouble();
        System.out.println("The Double Number is: "+ff);

        System.out.println("Enter a byte Value");
        byte by=sc.nextByte();
        System.out.println("The byte Value is: "+by);


    }

    public static void main(String[] args) {
        inputAllBaseType();
    }
}
