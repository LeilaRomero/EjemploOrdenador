package ejemploordenador;

/**
 *This document uses the constructors with parameters and without parameters,
 * In addition to the getters and setters methods.
 * @author lromerofajar
 */
public class Computer {

    Mouse mouse = new Mouse();
    Screen screen = new Screen();
    Cpu cpu = new Cpu();

    /**
     * In this constructor we specify the names used and the type of parameters
     * used for each of them.
     * 
     * @param mouse
     * @param screen
     * @param cpu 
     */
    
    public Computer(Mouse mouse, Screen screen, Cpu cpu) {

        this.mouse = mouse;
        this.screen = screen;
        this.cpu = cpu;

    }

    /**
     * In this constructor no parameters are defined.
     */
    
    public Computer() {

    }

    /**
     * In this method we use the set to send the mouse type.
     * @param mouse type mouse
     */
    
    public void setMouse(Mouse mouse) {

        this.mouse = mouse;
    }

    /**
     * With the get method, it returns the type of mouse requested in the established method.
     * @return type mouse
     */
    
    public Mouse getMouse() {

        return mouse;
    }

    /**
     * In this set you send us the screen.
     * @param screen type screen
     */
    
    public void setScreen(Screen screen) {

        this.screen = screen;
    }

    /**
     * With the get method, it returns the requested screen in the established method.
     * @return type screen
     */
    
    public Screen getScreen() {

        return screen;
    }

    /**
     * With the set method, the cpu asks us.
     * @param cpu type Cpu
     */
    
    public void setCpu(Cpu cpu) {

        this.cpu = cpu;
    }

    /**
     * With the get method, it returns the requested CPU in the established method.
     * @return 
     */
    
    public Cpu getCpu() {

        return cpu;
    }

    /**
     * It returns us on screen what is marked in the parentheses.
     */
    
    public void show() {

        System.out.println("Tipo ratón " + mouse.getMouse() + " tipo pantalla " + screen.getBrand() + "  " + screen.getInches()
                + " tipo cpu " + cpu.getSpeed() + "  " + cpu.getMemory());

    }
}
