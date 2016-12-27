import java.awt.AWTException;
import java.awt.Robot;

public class Main {

    public static void main(String[] args) {
        try {
            int x = 500, y = 500;

            Robot robot = new Robot();

            while(true) {
                System.out.println("Move mouse.");
                robot.mouseMove(x, y);
                x = x * -1;
                y = x;
                System.out.println("Sleep 30 seconds.");
                Thread.sleep(30000);
            }
        } catch (AWTException e){
        } catch (InterruptedException e){
        }
    }
}