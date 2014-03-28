package de.entwender.vidcare.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marek Mayer
 */
public class Configuration
{
    private Properties readProps()
    {
        Properties props = new Properties();
        try
        {
            props.load(new FileInputStream("config.properties"));
        } catch (IOException ioe)
        {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, "config.properties not found", ioe);
        }
        return props;
    }
}
