import java.util.Scanner;
//to do list
//idk... tltd

public class menu_assignment {
    public static void main (String[] args){
        //main menu
        System.out.println("     welcome this is what we server at narnia!");
        menu_gen("",0,0,false,0,true,true);
        menu_gen("Burger",15,10,true,1,true,false);
        menu_gen("salmon",12,24,true,2,true,false);
        menu_gen("a tree",100,500,true,3,true,false);
        menu_gen("hotdog",1,3,true,4,true,false);
        System.out.println("please enter one of the following numbers! ");
        //logic
        while (true){
            int user_choice_main=num_user_in();
            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()){
                System.out.println("Great choice would you like a side with that? ");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");
        }
        //side menu
        menu_gen("sides",0,0,false,0,false,true);
        menu_gen("no side",13,0,true,1,false,false);
        menu_gen("chips  ",5,0,true,2,false,false);
        menu_gen("bushes ",50,0,true,3,false,false);
        menu_gen("fries  ",7,0,true,3,false,false);
        while (true) {
            int user_choice_side = num_user_in();
            System.out.println("this is what you would like to choose?: y|n: ");
            if (user_in()) {
                System.out.println("Great choice now would you like a drink? ");
                break;
            }
            System.out.print("please pick one of the numbers again!: ");


        }
    }






    //generates the menu look
    public static void menu_gen(String name, int price_s,int price_L, boolean nex_line, int item_num,boolean main,boolean title){

        if (title) {
            if (main) {
                System.out.println("|              |      main        |                |");

            } else System.out.println("|             sides                |");
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
                        //case "5":
                            //return 5;
                        //case "6":
                            //return 6;
                        default:
                            System.out.println("please enter a valid number!");

                    }

        }

    }

    public static int calculation(int option_1,int option_2,int option_3, int option_4){



        return 1; //replace with final calc
    }




}
