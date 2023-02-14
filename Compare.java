import java.util.*;

class Compare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

    /*    if(a == b){
            System.out.println("Equal");
        }else{
            if(a > b){
                System.out.println("A is greter");
            }else{
                System.out.println("B is greter");
            }
        }  */

    // we use else if 
    if(a == b){
            System.out.println("Equal");
    }else if(a > b){
            System.out.println("A is greter");
    }else{
       System.out.println("B is greter");
    }
    }
}