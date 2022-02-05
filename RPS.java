import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RPS extends RPSwinner {
    public static void main(String[] args) throws InterruptedException {
        Scanner rock = new Scanner(System.in);
        //ITSABOUTDRIVEITSABOUTPOWERWESTAYHUNGRYWEDESDWAHRKJSHGSKDJG(sorry lmao) 
        //(why. just. why.)
        Scanner paper = new Scanner(System.in);
        Scanner scissors = new Scanner(System.in);

        String userResponse;
        String userGiven;
        boolean loopCheck = true;
        

        String [] arr = {"Rock", "Paper", "Scissors"};
        Random randomizer = new Random();
        
        String [] loserwords = {"Touch grass", "Don't play again", "Bozo", "Smellfungus", "Thy art stupid", "You're at the top of the bellcurve...", "I didn't know someone could lose this badly until now", "EMOtional D A M A G E"};
        Random loser = new Random();

        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Would you like to play a game?");
        userResponse = rock.next();

        while(loopCheck){
            if(userResponse.equals("Yes")) {
                
                int select = randomizer.nextInt(arr.length);
                int L = randomizer.nextInt(loserwords.length);
                
                System.out.println("Okay, give me rock, paper, or scissors on count of three!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Rock, (3)");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Paper, (2)");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Scissors, (1)");
                TimeUnit.SECONDS.sleep(1);

                System.out.println("SHOOT!");
                System.out.println(" ");
                System.out.println("Make a move:");
                userGiven = rock.next();
                
                
                System.out.println("--- " + arr[select] + " ---");
                
                if (userGiven.equals(loserwords[select])){ 
                    System.out.println("Copycat");
                }
                else if(select == 0){
                    if(userGiven.equals("Paper")){
                        System.out.println("Winner!");
                    }else{
                        System.out.println(loserwords[L]);
                    }
                }else if(select == 1){
                    if(userGiven.equals("Scissors")){
                        System.out.println("Winner!");
                    }else{
                        System.out.println(loserwords[L]);
                    }
                }else if(select == 2){
                    if(userGiven.equals("Rock")){
                        System.out.println("Winner!");
                    }
                }else{
                    System.out.println("This is a bug");
                }
                
                
                System.out.println("Play again?");
                String keepGoing = scissors.nextLine();
                
                if(keepGoing.equals("Yes")){
                    System.out.println("Let's play again!");
                    loopCheck = true;
                }else if(keepGoing.equals("No")){
                    System.out.println("Man...");
                    loopCheck = false;
                }else{
                    System.out.println("Gonna assume that's a no...");
                    loopCheck = false;
                }
                

            } else if(userResponse.equals("No")) {
                System.out.println("Alright then. heartbrocken~~ </3");
                loopCheck = false;
            }
        }
        rock.close();
        paper.close();
        scissors.close();
    }
}