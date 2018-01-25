public class Game {

    Player player;
    Player player1;
    private boolean winner = false;

    public Game(Player player, Player player1) {
        this.player = player;
        this.player1 = player1;
    }

    public void play(){

        while (!winner){
            System.out.println("Player 1 point: " +  player.point + "     Player 2 point: " + player1.point);

            player.miss();
            player1.miss();
            if (player.point==5 || player1.point==5){
                winner = true;
            }

        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Player 1 point: _ " +  player.point + "   Player 2 point: _ " + player1.point);
        if (player.point > player1.point)
            System.out.println("The winner is: " + player.name);
        else if (player.point==player1.point)
            System.out.println("Equal");
        else
            System.out.println("The winner is: " + player1.name);
    }
}
