/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * @author Sabeen Rafiq
 * @version 1.02 January 12th, 2024
 */
public class Heater
{
    /** The temperature setting that the heater should maintain. */
    private int temperature;
    
    /** The temperature setting for a newly created heater. */
    private static final int INITIAL_TEMPERATURE = 15;
    
    /** 
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
     private int increment;
    
    /** 
     * The default amount by which the temperature setting is 
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;
    
    /**
     * Stores minimum temperature for heater
     */
    private int min;
    
    /**
     * The default minimum value for the heater's temperature
     */
    private static final int MIN = 0;
    
    /**
     * Stores maximum temperature for heater
     */
    private int max;
    
    /**
     * The default maximum value for the heater's temperature
     */
    private static final int MAX = 100;
    
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.
     */
    public Heater()
    {
        temperature = INITIAL_TEMPERATURE;  
        increment = DEFAULT_INCREMENT;
        min = MIN;
        max = MAX;
    }
 
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees within the min and 
     * max temperatures.
     */    
    public Heater(int minTemp, int maxTemp)
    {
        temperature = INITIAL_TEMPERATURE;  
        increment = DEFAULT_INCREMENT;
        min = minTemp;
        max = maxTemp;
    }

    /**
     * Returns the current heater's temperature
     */    
    public int temperature()
    {
        return temperature;
    }
    
    /**
     * Increases the heater's temperature (as long as it is less than or equal to max)
     */
    public void warmer()
    {
        if (temperature + increment <= max)
        {
           temperature += increment; 
        }
    }

    /**
     * Decreases the heater's temperature (as long as it is greater than or equal to min)
     */    
    public void cooler()
    { 
        if (temperature - increment >= min)
        {
           temperature -= increment; 
        }
    }
    
    
    /**
     * Sets the increment to heat or cool the heater to value inputted (as long as greater than 0)
     */    
    public void setIncrement(int newIncrement)
    { 
        if (newIncrement > 0)
        {
            increment = newIncrement;
        }
    }
}
