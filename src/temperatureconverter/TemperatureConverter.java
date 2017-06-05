/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temperatureconverter;

import java.text.DecimalFormat;

/** This class implements the conversion functionality for a program that
 * converts temperature from one scale to another.
 *
 * filename: TemperatureConverter.java
 * @author Mike Schulenberg
 * @version 2.0
 * @since 
 */
public class TemperatureConverter 
{
    private final UI UI;
    
    // the standard degree symbol; used for multiple text elements
    double initialTemperature = 0;      
    // the temperature in degrees after conversion
    double convertedTemperature = 0;
    // tag consisting of degree symbol
    private final String DEGREE_SYMBOL = "\u00B0 ";
    
    public TemperatureConverter(UI ui) 
    {
        this.UI = ui;
    }
    
    //TODO: remove try/catch block and try to streamline code.
    /** Converts the temperature from Fahrenheit to Celsius
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertFahrenheitToCelsius(String temperatureStr)
    {
        /* Throw an exception if the user enters invalid temperature data.
        Otherwise, execute the conversion and prepare the result for display. */
        try
        {
            double temperature = Double.parseDouble(temperatureStr);
            initialTemperature = temperature;
            convertedTemperature = (temperature - 32.0) * (0.5556);
            printConvertedTemperature("F", "Celsius");
        }

        catch(Exception e)
        {
            printInputError();
        }  
    }
    
    //TODO: remove try/catch block and try to streamline code.
    /** Converts the temperature from Celsius to Fahrenheit.
     * 
     * @param temperatureStr A String containing the temperature data to convert.
     */
    public void convertCelsuisToFahrenheit(String temperatureStr){
        /* Throw an exception if the user enters invalid temperature data.
        Otherwise, execute the conversion and prepare the result for display. */
        try
        {
            double temperature = Double.parseDouble(temperatureStr);
            initialTemperature = temperature;
            convertedTemperature = (temperature * (1.8)) + 32.0;
            printConvertedTemperature("C", "Fahrenheit");
        }
        
        catch(Exception e)
        {
            printInputError();
        }
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
     * @param initialTempStr A String naming the measurement used for the
     * initial temperature--either "Fahrenheit" or "Celsius."
     * @param convertedTempStr A String naming the measurement used for the
     * converted temperature--either "Fahrenheit" or "Celsius."
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
