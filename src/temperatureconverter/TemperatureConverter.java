/** This class implements converts temperature from one scale to another.
 *
 * filename: TemperatureConverter.java
 * @author Mike Schulenberg - mike.schulenberg@gmail.com
 * @version 2.0
 * copyright 2017 Mike Schulenberg
 */

package temperatureconverter;

import java.text.DecimalFormat;

public class TemperatureConverter 
{
    private final UI UI;
    
    // the temperature in degrees before conversion
    double initialTemperature = 0;      
    // the temperature in degrees after conversion
    double convertedTemperature = 0;
    // the standard degree symbol; used for text elements in the GUI
    private final String DEGREE_SYMBOL = "\u00B0 ";
    
    public TemperatureConverter(UI ui) 
    {
        this.UI = ui;
    }
    
    /** Converts the temperature from Fahrenheit to Celsius
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertFahrenheitToCelsius(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = (initialTemperature - 32.0) * 0.555556;
            printConvertedTemperature("F", "Celsius");
        }
    }

    /** Converts the temperature from Celsius to Fahrenheit.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertCelsuisToFahrenheit(String temperatureStr){
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = (initialTemperature * 1.8) + 32.0;
            printConvertedTemperature("C", "Fahrenheit");
        }
    }
    
    /** Converts the temperature from Fahrenheit to Kelvin.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertFahrenheitToKelvin(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = (initialTemperature + 459.67) * 0.555556;
            printConvertedTemperature("F", "kelvins");
        }
    }
    
    /** Converts the temperature from Kelvin to Fahrenheit.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertKelvinToFahrenheit(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = (initialTemperature * 1.8) - 459.67;
            printConvertedTemperature("K", "Fahrenheit");
        }
    }
    
    /** Converts the temperature from Celsius to Kelvin.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertCelsiusToKelvin(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = initialTemperature + 273.15;
            printConvertedTemperature("C", "kelvins");
        }
    }
    
    /** Converts the temperature from Kelvin to Celsius.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertKelvinToCelsius(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = initialTemperature - 273.15;
            printConvertedTemperature("K", "Celsius");
        }
    }
    
    /** Attempts to parse temperature data into a double. If successful, the
     * data is stored as the initial temperature for conversion.
     * 
     * @param temperatureStr A String containing the temperature data to parse.
     * @return true if the temperature data is valid; false otherwise
     */
    private boolean parseTemperature(String temperatureStr)
    {
        boolean parseSuccessful = true;
        
        try
        {
            initialTemperature = Double.parseDouble(temperatureStr);
        }
        
        catch(NumberFormatException e)
        {
            printInputError();
            parseSuccessful = false;
        }
        
        return parseSuccessful;
    }
    
    /** Sends an error message to the GUI informing the user of an input error.
     * 
     */
    private void printInputError(){
        String msg = "Error: invalid temperature data";
        UI.printMessage(msg);
    }
    
    /** Formats and sens the result of the temperature conversion to the GUI.
     * 
     * @param initialTempStr A String representing the temperature scale used 
     * for the initial temperature.
     * @param convertedTempStr A String representing the temperature scale used
     * for the converted temperature.
     */
    public void printConvertedTemperature(String initialTempStr, 
            String convertedTempStr)
    {
        /* Prepare the unconverted and converted temperatures for output by
        converting them to Strings. */
        DecimalFormat df = new DecimalFormat("#.##");
        String initialTemp = df.format(initialTemperature);
        String convertedTemp = df.format(convertedTemperature);
        
        // Format the temperature conversion result and send to the GUI.
        String msg = initialTemp + DEGREE_SYMBOL + " " + initialTempStr 
                + " = " + convertedTemp + DEGREE_SYMBOL + " " 
                + convertedTempStr;       
        UI.printMessage(msg);
    }
}
