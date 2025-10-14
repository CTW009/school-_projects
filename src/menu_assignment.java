import java.util.Scanner;


public class menu_assignment {
    public static void main (String[] args){
        menu_gen("sprite",13,18,false,1);
        boolean user=user_in();
        System.out.println(user);



    }
    //generates the menu look
    public static void menu_gen(String name, int price_s,int price_L, Boolean nex_line, int item_num){
        if (nex_line){
            System.out.printf("|%s.%2s      |      %4d$       |         %4d$ |\n",item_num,name,price_s,price_L);
        }else{
            System.out.printf("|%s.%2s      |      %4d$       |         %4d$ |",item_num,name,price_s,price_L);
        }



    }


    public static boolean user_in(){
        Scanner user=new Scanner(System.in);
        while (true){
        String user_in=user.nextLine().toLowerCase().trim();
        System.out.println(user_in);
        if (user_in.equals("yes") ||user_in.equals("y")){
            return true;
        }else {
            System.out.println("invalid input please try again: ");
        }
        }

    }




}
