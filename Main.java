import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 to 3: ");
        int num = sc.nextInt();

        // Switch(num){
        //     case 1 : System.out.println("hello");
        //     break;

        //     case 2 : System.out.println("hii");
        //     break;

        //     case 3 : System.out.println("Namaste");
        //     break;

        //     default : System.out.println("default number");

        // }

        switch(num) {
            case 1 : System.out.println("hello");
                     break;
            case 2 : System.out.println("hii");
                     break;
            case 3 : System.out.println("namaste");
                     break;

            default : System.out.println("invalid");        
        }
    }
}