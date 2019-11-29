package ejemploordenador;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class ExampleComputer {

    /**
     * The main method is given by default since it is the main and mandatory.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);

        Computer or = new Computer();

        System.out.println("Kind Mouse");
        String kindMouse = sd.nextLine();
        System.out.println("Branch Screen");
        String kindBrand = sd.next();
        System.out.println("Inches Screen");
        float kindInches = sd.nextFloat();
        System.out.println("Speed cpu");
        int kindSpeed = sd.nextInt();
        System.out.println("Memory cpu");
        int kindMemory = sd.nextInt();

        Mouse mouse1 = new Mouse(kindMouse);
        Screen screen1 = new Screen(kindBrand, kindInches);
        Cpu cpu1 = new Cpu(kindSpeed, kindMemory);

        Computer ord1 = new Computer(mouse1, screen1, cpu1);
        ord1.show();
    }

}
