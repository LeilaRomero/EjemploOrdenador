package ejemploordenador;

/**
 *This document uses the constructors with parameters and without parameters,
 * In addition to the getters and setters methods.
 * @author lromerofajar
 */
public class Mouse {

    private String mouse;

    /**
     * In this constructor we specify the names used and the type of parameters
     * used for each of them.
     * @param mouse  type mouse
     */
    
    public Mouse(String mouse) {

        this.mouse = mouse;
    }

    /**
     * In this constructor no parameters are defined.
     */
    
    public Mouse() {

    }

    /**
     * In this method we use the set to send the mouse type.
     * @param mouse type mouse
     */
    
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    /**
     * With the get method, it returns the type of mouse requested in the established method.
     * @return returns us mouse.
     */
    
    public String getMouse() {

        return mouse;
    }
}
