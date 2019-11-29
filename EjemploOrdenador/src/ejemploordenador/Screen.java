package ejemploordenador;

/**
 * This document uses the constructors with parameters and without parameters,
 * In addition to the getters and setters methods.
 *
 * @author lromerofajar
 */
public class Screen {

    private String brand;
    private float inches;

    /**
     * In this constructor we specify the names used and the type of parameters
     * used for each of them.
     *
     * @param brandInches screen maker.
     * @param Inche screen diagonal.
     */
    public Screen(String brandInches, float Inche) {

        brand = brandInches;
        inches = Inche;
    }

    /**
     * In this constructor no parameters are defined.
     */
    public Screen() {

    }

    /**
     * In this method we use the set to send the brand name.
     *
     * @param brandInches you miss the screen mark.
     */
    public void setBrand(String brandInches) {

        brand = brandInches;
    }

    /**
     * With the get method, it returns the screen mark requested in the set method.
     *
     * @return give us back the name.
     */
    public String getBrand() {

        return brand;
    }

    /**
     * In this set you send us the screen inches entered.
     *
     * @param inche the inches go by.
     */
    public void setInches(float inche) {

        inches = inche;
    }

    /**
     * In the get of this method gives us the inches that were requested
     * in the previous method.
     *
     * @return returns us inches.
     */
    public float getInches() {

        return inches;
    }
}
