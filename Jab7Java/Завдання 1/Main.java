import java.util.Random;

class CapitalHouse extends Thread {
    private final int width;
    private final int height;
    private final int speed;

    public CapitalHouse(int width, int height, int speed) {
        this.width = width / 2;
        this.height = height / 2;
        this.speed = speed;
    }

    @Override
    public void run() {
        Random random = new Random();
        int x = random.nextInt(width);
        int y = random.nextInt(height);

        System.out.println("Capital House starting at: (" + x + ", " + y + ")");

        while (x < width && y < height) {
            x += speed;
            y += speed;
            System.out.println("Capital House position: (" + x + ", " + y + ")");
            try {
                Thread.sleep(1000); // Час паузи в мілісекундах
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Capital House reached destination.");
    }
}

class WoodenHouse extends Thread {
    private final int width;
    private final int height;
    private final int speed;

    public WoodenHouse(int width, int height, int speed) {
        this.width = width / 2;
        this.height = height / 2;
        this.speed = speed;
    }

    @Override
    public void run() {
        Random random = new Random();
        int x = width + random.nextInt(width);
        int y = height + random.nextInt(height);

        System.out.println("Wooden House starting at: (" + x + ", " + y + ")");

        while (x > width && y > height) {
            x -= speed;
            y -= speed;
            System.out.println("Wooden House position: (" + x + ", " + y + ")");
            try {
                Thread.sleep(1000); // Час паузи в мілісекундах
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wooden House reached destination.");
    }
}

public class Main {
    public static void main(String[] args) {
        int width = 100; // Змініть на ширину вашої області симуляції
        int height = 100; // Змініть на висоту вашої області симуляції
        int speed = 5; // Змініть на бажану швидкість руху будинків

        CapitalHouse capitalHouse = new CapitalHouse(width, height, speed);
        capitalHouse.start();

        WoodenHouse woodenHouse = new WoodenHouse(width, height, speed);
        woodenHouse.start();
    }
}
