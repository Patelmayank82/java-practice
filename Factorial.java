import java.util.*;

class Factorial{
    
    public static void fact(int a){

        if(a<0){
            System.out.print("Invalid number");
            return;
        }

        int fact=1;
        for(int i = 1; i<=a; i++){
            fact = fact * i;
        }
        System.out.println("This number factorial is: "+ fact);
        return;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int a = sc.nextInt();
       
        fact(a);
        
    }
}