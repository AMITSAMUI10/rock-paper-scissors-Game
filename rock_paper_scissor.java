package FirstProgram.com;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("stone=1  paper=2  scissor=3 \nNow Enter What You Want To Pick: ");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("You have picked stone.");
        }
        if(a==2){
            System.out.println("You have picked paper.");
        }
        if(a==3){
            System.out.println("You have picked scissor.");
        }
        Random ran = new Random();
        int b = ran.nextInt(1,4);
/*  "You can use this also"
        if(b==1){
            System.out.print("PC has picked stone.");
        }
        else if(b==2){
            System.out.print("PC has picked Paper.");
        }
        else if(b==3){
            System.out.print("PC has picked scissor.");
        }
 */
        switch(b){
            case 1:
                System.out.println("PC has picked stone.");
                break;
            case 2:
                System.out.println("PC has picked Paper.");
                break;
            case 3:
                System.out.println("PC has picked scissor.");
                break;
        }
        if(a==1 & b==1){
            System.out.println("The game is draw");
        }
        else if(a==1 & b==2){
            System.out.println("PC is the winner");
        }
        else if(a==1 & b==3){
            System.out.println("You are the winner");
        }
        else if(a==2 & b==1){
            System.out.println("PC the winner");
        }
        else if(a==2 & b==2){
            System.out.println("The game is draw");
        }
        else if(a==2 & b==3){
            System.out.println("PC is the winner");
        }
        else if(a==3 & b==1){
            System.out.println("PC is the winner");
        }
        else if(a==3 & b==2){
            System.out.println("You are the winner");
        }
        else if(a==3 & b==3){
            System.out.println("The game is draw");
        }
    }
}
