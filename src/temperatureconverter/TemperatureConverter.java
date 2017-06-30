/** This class converts temperature from one scale to another.
 *
 * filename: TemperatureConverter.java
 * @author Mike Schulenberg - mike.schulenberg@gmail.com
 * @version 2.0
 * copyright 2017 Mike Schulenberg
 */

package temperatureconverter;

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
            convertedTemperature = roundDecimal(convertedTemperature);
            printConvertedTemperature(DEGREE_SYMBOL + " F", 
                    DEGREE_SYMBOL + " Celsius");
        }
    }

    /** Converts the temperature from Celsius to Fahrenheit.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertCelsuisToFahrenheit(String temperatureStr)
    {
        if (parseTemperature(temperatureStr))
        {
            convertedTemperature = (initialTemperature * 1.8) + 32.0;
            convertedTemperature = roundDecimal(convertedTemperature);
            printConvertedTemperature(DEGREE_SYMBOL + " C", 
                    DEGREE_SYMBOL + " Fahrenheit");
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
            convertedTemperature = roundDecimal(convertedTemperature);
            String kelvinLabel = chooseKelvinLabel();
            printConvertedTemperature(DEGREE_SYMBOL + " F", kelvinLabel);
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
            convertedTemperature = roundDecimal(convertedTemperature);
            printConvertedTemperature(" K", DEGREE_SYMBOL + " Fahrenheit");
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
            convertedTemperature = roundDecimal(convertedTemperature);
            String kelvinLabel = chooseKelvinLabel();
            printConvertedTemperature(DEGREE_SYMBOL + " C", kelvinLabel);
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
            convertedTemperature = roundDecimal(convertedTemperature);
            printConvertedTemperature(" K", DEGREE_SYMBOL + " Celsius");
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
    
    /** Rounds a number to 2 decimal places.
     * 
     * @param value A number to be rounded.
     * @return A number rounded to 2 decimal places.
     */
    private double roundDecimal(double value)
    {
        return Math.round(value * 100.0) / 100.0;
    }
    
    /** Sends an error message to the GUI informing the user of an input error.
     * 
     */
    private void printInputError(){
        String msg = "Error: invalid temperature data";
        UI.printMessage(msg);
    }
    
    /** Checks the value of the converted temperature and determines if a string
     * representing the singular or plural form of "kelvin" should be used.
     * 
     * @return Either " kelvin" or " kelvins".
     */
    private String chooseKelvinLabel()
    { 
        if ((convertedTemperature > 0 && convertedTemperature <= 1)
                || (convertedTemperature < 0 && convertedTemperature >= -1))
        {
            return " kelvin";
        }

        else
        {
            return " kelvins";
        }
    }
    
    /** Formats and sends the result of the temperature conversion to the GUI.
     * 
     * @param initialTempStr A String representing the temperature scale used 
     * for the initial temperature.
     * @param convertedTempStr A String representing the temperature scale used
     * for the converted temperature.
     */
    public void printConvertedTemperature(String initialTempStr, 
            String convertedTempStr)
    {
        /* Round the initial temperature before printing. 
        The converted temperature should already have been rounded as part of 
        the conversion process. */
        initialTemperature = roundDecimal(initialTemperature);
        
        String msg = initialTemperature + initialTempStr + " = " 
                + convertedTemperature + convertedTempStr; 
        UI.printMessage(msg);
    }
}
