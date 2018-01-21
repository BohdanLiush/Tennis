import java.util.Random;

public class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }

    int point = 0;
    public int game(){
        Random random = new Random();
            int a = random.nextInt(100);
            if (a > 30)
              /*  point = 0;
            else*/
                point++;
        return point;
    }
}
