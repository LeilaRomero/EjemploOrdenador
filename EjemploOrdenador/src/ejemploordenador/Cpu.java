package ejemploordenador;

/**
 * This document uses the constructors with parameters and without parameters,
 * In addition to the getters and setters methods.
 *
 * @author lromerofajar
 */
public class Cpu {

    private int speed;
    private int memory;

    /**
     * In this constructor we specify the names used and the type of parameters
     * used for each of them.
     *
     * @param speed cpu speed
     * @param memory cpu memory
     */
    public Cpu(int speed, int memory) {

        this.speed = speed;
        this.memory = memory;
    }

    /**
     * In this constructor no parameters are defined.
     */
    public Cpu() {

    }

    /**
     * In this method we use the set to send the screen speed.
     * @param speed type speed
     */
    
    public void setSpeed(int speed) {

        this.speed = speed;
    }

    /**
     * In this method we use get to return the screen speed.
     * @return type speed
     */
    
    public int getSpeed() {

        return speed;
    }

    /**
     * In this method we use set to send the memory of the cpu.
     * @param memory type memory
     */
    
    public void setMemory(int memory) {

        this.memory = memory;
    }

    /**
     * The speed of the cpu returns to us.
     * @return memory
     */
    
    public int getMemory() {

        return memory;
    }
}
