import java.util.Scanner;
class Guesser{
    int guesserNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser guess your number : ");
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}

class Player{
    int playerNum;

    public int guessNum(){
        Scanner sc = new Scanner(System.in);
        playerNum = sc.nextInt();
        return playerNum;
    }
}

class Umpire{
    int gNum;
    int playerNum1;
    int playerNum2;
    int playerNum3;

    public void collectNumFromGuesser(){
        Guesser G = new Guesser();
        gNum = G.guessNum();
    }

    public void collectNumFromPlayers(){
        Player p1 = new Player();
        System.out.print("Player1 guess your number : ");
        playerNum1 = p1.guessNum();

        Player p2 = new Player();
        System.out.print("Player2 guess your number : ");
        playerNum2 = p2.guessNum();

        Player p3 = new Player();
        System.out.print("Player3 guess your number : ");
        playerNum3 = p3.guessNum();
    }

    public void compare(){
        if(gNum==playerNum1){

            if(gNum==playerNum2 && gNum==playerNum3){
                System.out.println("All players won the game");
            }else if(gNum==playerNum2){
                System.out.println("Player1 and Player2 won the game");
            }else if(gNum==playerNum3){
                System.out.println("Player1 and Player3 won the game");
            }else{
                System.out.println("Only Player1 won the game");
            }

        }
        else if(gNum==playerNum2){

            if(gNum==playerNum3){
                System.out.println("Player2 and Player3 won the game");
            }else{
                System.out.println("Only Player2 won the game");
            }

        }
        else if(gNum==playerNum3){
            System.out.println("Only Player3 won the game");

        }
        else{
            System.out.println("All Players lost the game");

        }
    }

}

public class GuesserGame {

    public static void main(String[] args){
        Umpire UM = new Umpire();
        System.out.println("-----Game Started-----");
        UM.collectNumFromGuesser();
        UM.collectNumFromPlayers();
        UM.compare();
        System.out.println("-----Game Over-----");

    }
}
