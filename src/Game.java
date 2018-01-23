public class Game {
    Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void play(){
        while (player.point!=5){
            player.miss();
        }
    }
}
