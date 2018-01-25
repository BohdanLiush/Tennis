import java.util.Random;

public class Player {

    String name;
    int point = 0;
    public Player(String name){
        this.name = name;
    }

    public void miss(){
        Random random = new Random();
            int a = random.nextInt(100);
            System.out.println("random miss =  " + a);
            if (a > 30) {
                hitHard();
            }
    }

    public int hitHard(){
        Random random = new Random();
        int a = random.nextInt(100);
        System.out.println("random hit hard = " + a);
        if (a > 20) {
            point++;
        }
        return point;
    }
}


