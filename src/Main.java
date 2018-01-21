public class Main {
    public static void main(String[] args) {
        Player player = new Player("JACK");
        Player player1 = new Player("TOM");

        while (player.game() <= 4 && player1.game() <= 4){
            System.out.println("Player 1 point: " +  player.point + "     Player 2 point: " + player1.point);
                player.game();
                player1.game();
        }

        System.out.println();
        System.out.println("Player 1 point: _ " +  player.point + "   Player 2 point: _ " + player1.point);
        if (player.point >player1.point)
            System.out.println("The winner is: " + player.name);
        else
            System.out.println("The winner is: " + player1.name);

    }
}
