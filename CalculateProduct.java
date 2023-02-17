import java.util.*;

class CalculateProduct{
    
    public static int ProductNum(int a , int b){
        int product = a * b;
        return product;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int product = ProductNum(a,b);
        System.out.println("Product of two number is: "+ product);
    }
}