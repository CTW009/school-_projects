import java.util.Scanner;
//to do list
//idk... tltd
//NOT DONE I NEED TO ADD LARGE AND SMALL OPTIONS FOR MAIN MUNU DONT FORGET!!!!!
public class menu_assignment {
    public static void main (String[] args){
        //some vars to init them as globals
        int user_choice_main;
        int user_choice_side;
        int user_choice_drink;
        int user_choice_desert;
        String L_S;
        //main menu
        Scanner scanner = new Scanner(System.in);

        System.out.println("     welcome this is what we serve at narnia!");
        menu_gen("",0,0,false,0,true,true,"main");
        menu_gen("Burger",10,15,true,1,true,false,"");
        menu_gen("salmon",12,24,true,2,true,false,"");
        menu_gen("a tree",100,500,true,3,true,false,"");
        menu_gen("hotdog",1,3,true,4,true,false,"");
        System.out.println("please enter one of the following numbers! ");
        //logic


        while (true){

            user_choice_main=num_user_in();

            while (true) {
                System.out.println("please enter one of the following formats for large | small: L | S | l | s");
                L_S = scanner.nextLine().toLowerCase().strip();
                if (L_S.equals("l") || L_S.equals("s")) {
                    break;
                }else{
                    System.out.println("please enter a valid format/letter ie: S | L | s | l");
                }
            }

            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()){
                System.out.println("Great choice would you like a side with that? ");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");
        }
        //side menu
        menu_gen("",0,0,false,0,false,true,"sides");
        menu_gen("no side",0,0,true,1,false,false,"");
        menu_gen("chips  ",5,0,true,2,false,false,"");
        menu_gen("bushes ",50,0,true,3,false,false,"");
        menu_gen("fries  ",7,0,true,4,false,false,"");


        while (true) {
            user_choice_side = num_user_in();
            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()) {
                System.out.println("Great choice now would you like a drink? ");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");


        }


        menu_gen("",0,0,false,0,false,true," drink");
        menu_gen("no drink",0,0,true,1,false,false,"");
        menu_gen("sprite  ",5,0,true,2,false,false,"");
        menu_gen("water   ",50,0,true,3,false,false,"");
        menu_gen("coke    ",4,0,true,4,false,false,"");

        while (true) {
            user_choice_drink = num_user_in();
            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()) {
                System.out.println("Great choice now would you like a desert? ");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");


        }

        menu_gen("",0,0,false,0,false,true," desert");
        menu_gen("no desert",0,0,true,1,false,false,"");
        menu_gen("cake     ",5,0,true,2,false,false,"");
        menu_gen("ice cream",12,0,true,3,false,false,"");
        menu_gen("float    ",15,0,true,4,false,false,"");


        while (true) {
            user_choice_desert = num_user_in();
            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()) {
                System.out.printf("great your total is %d$ ",calculation(user_choice_main,user_choice_side,user_choice_drink,user_choice_desert,L_S));
                System.out.println("have a great day!");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");


        }


    }






    //generates the menu look
    public static void menu_gen(String name, int price_s,int price_L, boolean nex_line, int item_num,boolean main,boolean title, String title_name){

        if (title) {
            if (main) {
                System.out.printf("|              |      %s        |                |\n",title_name);

            } else System.out.printf("|             %s                |\n", title_name);
        } else if (main) {
            if (nex_line){
                System.out.printf("|%s.%2s      |      %4d$       |     %4d$      |\n",item_num,name,price_s,price_L);
            }else{
                System.out.printf("|%s.%2s      |      %4d$       |     %4d$      |",item_num,name,price_s,price_L);
            }
        }else{
            if (nex_line){
                System.out.printf("|%s.%2s      |      %4d$       |\n",item_num,name,price_s);
            }else{
                System.out.printf("|%s.%2s      |      %4d$       |",item_num,name,price_s);
        }






    }
      }


    public static boolean user_in(){
        Scanner user=new Scanner(System.in);
        while (true){
        String user_in=user.nextLine().toLowerCase().trim();
        System.out.println(user_in);
        if (user_in.equals("yes") ||user_in.equals("y")){
            return true;
        }else if(user_in.equals("no")|| user_in.equals("n")){
            return false;
        }else{
            System.out.println("invalid input please try again: ");
        }
        }

    }

    public static int num_user_in(){

        Scanner user_in= new Scanner(System.in);
        while (true){
            String user=user_in.nextLine().strip();
                if (user.length()>1){
                    System.out.println("please enter a valid input ie: 1 | 2 | 3 | 4 |...|: ");
                } else
                    switch (user){
                        case "1":
                            return 1;
                        case "2":
                            return 2;
                        case "3":
                            return 3;
                        case "4":
                            return 4;
                        default:
                            System.out.println("please enter a valid number!");

                    }

        }

    }

    public static int calculation(int option_1,int option_2,int option_3, int option_4,String small_larger){
        int main_sum=-1;
        int side_sum=-1;
        int drink_sum=-1;
        int dessert_sum=-1;
        //main money
        if (small_larger.equals("s")){
        switch (option_1){
            case -1:
                break;
            case 1:
                main_sum=10;
                break;
            case 2:
                main_sum=12;
                break;
            case 3:
                main_sum=100;
                break;
            case 4:
                main_sum=1;
                break;
        }
        }else{ switch (option_1) {
            case -1:
                break;
            case 1:
                main_sum = 15;
                break;
            case 2:
                main_sum = 24;
                break;
            case 3:
                main_sum = 500;
                break;
            case 4:
                main_sum = 3;
                break;
        }
           }
        switch (option_2){
            case -1:
                break;
            case 1:
                side_sum=0;
                break;
            case 2:
                side_sum=5;
                break;
            case 3:
                side_sum=50;
                break;
            case 4:
                side_sum=7;
                break;
        }
        switch (option_3){
            case -1:
                break;
            case 1:
                drink_sum=0;
                break;
            case 2:
                drink_sum=5;
                break;
            case 3:
                drink_sum=50;
                break;
            case 4:
                drink_sum=4;
                break;
        }
        switch (option_4){
            case -1:
                break;
            case 1:
                dessert_sum=0;
                break;
            case 2:
                dessert_sum=5;
                break;
            case 3:
                dessert_sum=12;
                break;
            case 4:
                dessert_sum=15;
                break;
        }

        if (option_2>1 && option_3>1){
            System.out.println("you get a discount of $5 because you choosed a drink and a side!");
            return main_sum+side_sum+drink_sum+dessert_sum-5;
        }

        return main_sum+side_sum+drink_sum+dessert_sum; //replace with final calc
    }




}
