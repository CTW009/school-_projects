import java.util.Scanner;
public class some_practice_on_methods_4a {


    public static void main (String[] arg){
        Scanner scanner= new Scanner(System.in);

        int len =5;
        int wid = 90;

        int a =area(len,wid);
        int p = permimiter(len, wid);
        System.out.println(a);
        System.out.println(p);
        System.out.println(iseven(8));
        System.out.println(iseven(3));
        henry_st();
        System.out.println("please enter a string!: ");
        String user_in=scanner.nextLine();
        banner(user_in);

    }

    public static int area (int len,  int wid){
        return len*wid;

    }


    // ahhhh came back haven't coded in 2 weeks :(


    public static int permimiter (int len, int wid){
        return (len*2) + (wid*2);
    }


    public static boolean iseven (int num){
        return (num%2==0);

    }
    public static void henry_st (){
        System.out.println("********************************");
        System.out.println("!!! Henry Street High School !!!");
        System.out.println("********************************");
    }
    public static String banner(String in){
        System.out.println("********************************");
        System.out.println(in);
        System.out.println("********************************");
        return "done";
    }
}
