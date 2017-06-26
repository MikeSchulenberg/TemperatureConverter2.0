/** This class implements a GUI for a temperature conversion program.
 *
 * filename: UI.java
 * @author Mike Schulenberg - mike.schulenberg@gmail.com
 * @version 2.0
 * copyright 2017 Mike Schulenberg
 */

package temperatureconverter;

public class UI extends javax.swing.JFrame {
    private final TemperatureConverter CONVERTER;
    
    /**
     * Creates new form TemperatureConverterUI
     */
    public UI() {
        initComponents();
        CONVERTER = new TemperatureConverter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        celsiusRadioButton = new javax.swing.JRadioButton();
        fahrenheitRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        temperatureField = new javax.swing.JTextField();
        OKbutton = new javax.swing.JButton();
        kelvinRadioButton = new javax.swing.JRadioButton();
        convertFromComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter 2.0");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(celsiusRadioButton);
        celsiusRadioButton.setSelected(true);
        celsiusRadioButton.setText("Celsius");
        celsiusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(fahrenheitRadioButton);
        fahrenheitRadioButton.setText("Fahrenheit");
        fahrenheitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrenheitRadioButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Convert to:");

        temperatureLabel.setText("Temperature:");

        temperatureField.setPreferredSize(new java.awt.Dimension(60, 20));
        temperatureField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureFieldActionPerformed(evt);
            }
        });

        OKbutton.setText("OK");
        OKbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(kelvinRadioButton);
        kelvinRadioButton.setText("Kelvin");
        kelvinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelvinRadioButtonActionPerformed(evt);
            }
        });

        convertFromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        convertFromComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertFromComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(celsiusRadioButton)
                    .addComponent(fahrenheitRadioButton))
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(temperatureLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OKbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(kelvinRadioButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(temperatureField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celsiusRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fahrenheitRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kelvinRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OKbutton)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputLabel.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /** Sets Celsius as the temperature scale being converted to.
     * 
     * @param evt The event triggered by the radio button selection.
     */
    private void celsiusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusRadioButtonActionPerformed
        setScaleToConvertTo(TemperatureScale.CELSIUS);       
    }//GEN-LAST:event_celsiusRadioButtonActionPerformed

    /** Allows the user to enter a temperature to be converted. It executes the
     * conversion when used.
     * 
     * @param evt The event triggered when "Enter" is pressed on the text field.
     */
    private void temperatureFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureFieldActionPerformed
        convertTemperature();
    }//GEN-LAST:event_temperatureFieldActionPerformed

    /** Sets Fahrenheit as the temperature scale being converted to.
     * 
     * @param evt The event triggered by the radio button selection.
     */
    private void fahrenheitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrenheitRadioButtonActionPerformed
        setScaleToConvertTo(TemperatureScale.FAHRENHEIT); 
    }//GEN-LAST:event_fahrenheitRadioButtonActionPerformed

    /** Executes the temperature conversion when the "OK" button is pressed.
     * 
     * @param evt The event triggered by the button press.
     */
    private void OKbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbuttonActionPerformed
         convertTemperature();
    }//GEN-LAST:event_OKbuttonActionPerformed

    /** Sets Kelvin as the temperature scale being converted to.
     * 
     * @param evt The event triggered by the radio button selection.
     */
    private void kelvinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelvinRadioButtonActionPerformed
        setScaleToConvertTo(TemperatureScale.KELVIN);
    }//GEN-LAST:event_kelvinRadioButtonActionPerformed

    /** Sets the temperature scale being converted from.
     * 
     * @param evt The event triggered by the ComboBox action.
     */
    private void convertFromComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertFromComboBoxActionPerformed
        int convertFromIndex = convertFromComboBox.getSelectedIndex();
        
        switch (convertFromIndex)
        {
            case 0 :
                setScaleToConvertFrom(TemperatureScale.FAHRENHEIT);
                break;
            case 1 :
                setScaleToConvertFrom(TemperatureScale.CELSIUS);
                break;
            case 2 :
                setScaleToConvertFrom(TemperatureScale.KELVIN);
                break;
        }
    }//GEN-LAST:event_convertFromComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton celsiusRadioButton;
    private javax.swing.JComboBox<String> convertFromComboBox;
    private javax.swing.JRadioButton fahrenheitRadioButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton kelvinRadioButton;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField temperatureField;
    private javax.swing.JLabel temperatureLabel;
    // End of variables declaration//GEN-END:variables

    // represents the temperature scales supported for conversion
    private enum TemperatureScale {FAHRENHEIT, CELSIUS, KELVIN};
    // set default temperature scale to convert from
    private TemperatureScale convertFrom = TemperatureScale.FAHRENHEIT;
    // set default temperature scale to convert to
    private TemperatureScale convertTo = TemperatureScale.CELSIUS;  
    
    // used to switch between temperature conversion modes
    private enum ConversionMode {FAHRENHEIT_TO_CELSIUS, CELSIUS_TO_FAHRENHEIT,
        FAHRENHEIT_TO_KELVIN, KELVIN_TO_FAHRENHEIT,
        CELSIUS_TO_KELVIN, KELVIN_TO_CELSIUS};
    // set default conversion mode
    private ConversionMode conversionMode 
            = ConversionMode.FAHRENHEIT_TO_CELSIUS;
    
    /** Sets the temperature scale being converted from.
     * 
     * @param newScale The temperature scale to convert from.
     */
    private void setScaleToConvertFrom(TemperatureScale newScale)
    {
        convertFrom = newScale;

        if (convertFrom == convertTo)
        {  
            /* The temperature scale being converted from is the same as the
            scale being converted to. Change the scale being converted to. */
            switch (convertFrom)
            {
                case FAHRENHEIT :
                    celsiusRadioButton.setSelected(true);
                    setScaleToConvertTo(TemperatureScale.CELSIUS);
                    break;
                case CELSIUS :
                    fahrenheitRadioButton.setSelected(true);
                    setScaleToConvertTo(TemperatureScale.FAHRENHEIT);
                    break;
                case KELVIN :
                    fahrenheitRadioButton.setSelected(true);
                    setScaleToConvertTo(TemperatureScale.FAHRENHEIT);
                    break;
            }
        }
        
        // update the conversion mode after changing a temperature scale
        updateConversionMode();
    }
    
    /** Sets the temperature scale being converted to.
     * 
     * @param newScale The temperature scale to convert to.
     */
    private void setScaleToConvertTo(TemperatureScale newScale)
    {
        convertTo = newScale;       

        if (convertTo == convertFrom)
        {
            /* The temperature scale being converted to is the same as the scale
            being converted from. Change the scale being converted from. */
            switch (convertTo)
            {
                case FAHRENHEIT :
                    // set scale to convert from = Celsius
                    convertFromComboBox.setSelectedIndex(1);
                    break;
                case CELSIUS :
                    // set scale to convert from = Fahrenheit
                    convertFromComboBox.setSelectedIndex(0);
                    break;
                case KELVIN :
                    // set scale to convert from = Fahrenheit
                    convertFromComboBox.setSelectedIndex(0);
                    break;
            }
        }
        
        // update the conversion mode after changing a temperature scale
        updateConversionMode();
    }
    
    /** Updates the temperature conversion mode. Should be used after the 
     * user changes a temperature scale, whether it's the scale being converted
     * to or the scale being converted from.
     * 
     */
    private void updateConversionMode()
    {
        switch (convertFrom)
        {
            case FAHRENHEIT :
                setFahrenheitToX();
                break;
            case CELSIUS :
                setCelsiusToX();
                break;
            case KELVIN :
                setKelvinToX();
                break;
        }
    }
    
    /** Sets the temperature conversion mode based on Fahrenheit being
     * the temperature scale to convert from. Checks which of the remaining
     * scales is being converted to before changing the conversion mode.
     * 
     */
    private void setFahrenheitToX()
    {
        if (convertTo == TemperatureScale.CELSIUS)
        {
            conversionMode = ConversionMode.FAHRENHEIT_TO_CELSIUS;
        }
        
        else
        {
            conversionMode = ConversionMode.FAHRENHEIT_TO_KELVIN;
        }
    }
    
    /** Sets the temperature conversion mode based on Celsius being
     * the temperature scale to convert from. Checks which of the remaining
     * scales is being converted to before changing the conversion mode.
     * 
     */
    private void setCelsiusToX()
    {
        if (convertTo == TemperatureScale.FAHRENHEIT)
        {
            conversionMode = ConversionMode.CELSIUS_TO_FAHRENHEIT;
        }
        
        else
        {
            conversionMode = ConversionMode.CELSIUS_TO_KELVIN;
        }
    }
    
    /** Sets the temperature conversion mode based on Kelvin being
     * the temperature scale to convert from. Checks which of the remaining
     * scales is being converted to before changing the conversion mode.
     * 
     */
    private void setKelvinToX()
    {
        if (convertTo == TemperatureScale.FAHRENHEIT)
        {
            conversionMode = ConversionMode.KELVIN_TO_FAHRENHEIT;
        }
        
        else
        {
            conversionMode = ConversionMode.KELVIN_TO_CELSIUS;
        }
    }
    
    /** Determines which temperature conversion mode to execute and calls
     * the appropriate method in the `TemperatureConverter` class.
     * 
     */
    private void convertTemperature()
    {
        String temperature = temperatureField.getText();           
            
        switch(conversionMode)
        {
            case FAHRENHEIT_TO_CELSIUS :
                CONVERTER.convertFahrenheitToCelsius(temperature);
                break;
            case CELSIUS_TO_FAHRENHEIT :
                CONVERTER.convertCelsuisToFahrenheit(temperature);
                break; 
            case FAHRENHEIT_TO_KELVIN :
                CONVERTER.convertFahrenheitToKelvin(temperature);
                break;
            case KELVIN_TO_FAHRENHEIT :
                CONVERTER.convertKelvinToFahrenheit(temperature);
                break;
            case CELSIUS_TO_KELVIN :
                CONVERTER.convertCelsiusToKelvin(temperature);
                break;
            case KELVIN_TO_CELSIUS :
                CONVERTER.convertKelvinToCelsius(temperature);        
                break;
            default :
                System.out.println("Error: invalid conversion mode");
        }
    }
    
    /** Prints a message to the UI.
     * 
     * @param msg The text that should be displayed.
     */
    public void printMessage(String msg)
    {
        outputLabel.setText(msg);
    }
}
