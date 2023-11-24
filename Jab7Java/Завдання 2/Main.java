import java.util.ArrayList;
import java.util.List;

abstract class BaseAI extends Thread {
    protected boolean running;
    protected int priority;

    public BaseAI() {
        running = true;
        priority = Thread.NORM_PRIORITY;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setPriority(int priority) {
        this.priority = priority;
        setPriority(priority);
    }

    @Override
    public void run() {
        while (running) {

            performAction();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    abstract void performAction();
}

class ShipAI extends BaseAI {
    @Override
    void performAction() {
        System.out.println("ShipAI performing action...");
    }
}

class SteamboatAI extends BaseAI {
    @Override
    void performAction() {
        System.out.println("SteamboatAI performing action...");
    }
}

class SailboatAI extends BaseAI {
    @Override
    void performAction() {
        System.out.println("SailboatAI performing action...");
    }
}

class CorvetteAI extends BaseAI {
    @Override
    void performAction() {
        System.out.println("CorvetteAI performing action...");
    }
}

public class Main {
    public static void main(String[] args) {
        ShipAI shipAI = new ShipAI();
        SteamboatAI steamboatAI = new SteamboatAI();
        SailboatAI sailboatAI = new SailboatAI();
        CorvetteAI corvetteAI = new CorvetteAI();

        List<BaseAI> aiList = new ArrayList<>();
        aiList.add(shipAI);
        aiList.add(steamboatAI);
        aiList.add(sailboatAI);
        aiList.add(corvetteAI);

        for (BaseAI ai : aiList) {
            ai.start();
        }

        for (BaseAI ai : aiList) {
            ai.Show();
        }
    }
}
