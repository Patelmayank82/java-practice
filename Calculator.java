import java.util.*;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter your choice: ");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.divition");
        int choice = sc.nextInt();

    switch(choice)
    {
        case 1 : System.out.println("addition: "+(a+b));
        break;

        case 2 : System.out.println("subtraction: "+(a-b));
        break;

        case 3 : System.out.println("multiplication: "+(a*b));
        break;

        case 4 : System.out.println("divition: "+(a/b));
        break;

        default : System.out.println("invalid choice");
       
        
    }
    }
}