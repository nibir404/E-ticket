import java.util.Scanner;

public class Ticket {
    public static void Confirmation(){
        String name;
        String Theatre_name;
        int contact,seat_no;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        name = sc.nextLine();
        System.out.println("Welcome "+name);

        System.out.println("In which theatre you want to see this movie sir?");
        Theatre_name = sc.nextLine();
        System.out.println("You have choosen "+Theatre_name+" sir");

        System.out.println("Enter your contact sir");
        contact = sc.nextInt();
        if (contact >= 11){
            System.out.println("your contact number is : "+contact);
        }
        else {
            System.out.println("you have entered an invalid contact ");
            System.out.println("please try again!!!");
        }

          System.out.println("enter your seat number that you want to seat ");
          seat_no = sc.nextInt();
              try {
              if (seat_no == 1) {
                  System.out.println("you have chosen a 1st class seat");
              } else if (seat_no == 2) {
                  System.out.println("you have chosen a 2nd class seat");
              } else if (seat_no == 3) {
                  System.out.println("you have chosen a last row seat");
              } else if (seat_no != 1 && seat_no != 2 && seat_no != 3) {
                  System.out.println("please confirm your priority seat first ");
              } else System.out.println("try again");
          } catch (Exception e) {
                  System.out.println("false validation");
              }
       }



    public static void moneyForTicket(){
        int cash;
        String serial;
        Scanner in = new Scanner(System.in);
        System.out.println("which seat you prefer sir :");
        serial = in.nextLine();
        System.out.println("you have chosen "+serial+" sir");
        System.out.println("please pay first sir : ");
        System.out.println("you have to pay 500 taka sir ");
        cash = in.nextInt();
        if (cash == 500 ){
            System.out.println("you have paid full amount sir ");
            if (cash < 500 ){
                System.out.println("please sir pay full amount");
                System.out.println("try again!!!");
            }
        }
    }

    public void show(){
        Confirmation();
        moneyForTicket();
    }
}
