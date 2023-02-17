import java.util.*;

class Function2{

    public static void PrintName(String name){
        System.out.println("Your name is: "+name);
        return;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        PrintName(name);
    }
}