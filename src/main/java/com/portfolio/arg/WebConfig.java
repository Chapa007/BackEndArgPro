package com.portfolio.arg;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 /**
 *
 * @author lucad
 */


@EnableWebMvc

@Configuration

public class WebConfig implements WebMvcConfigurer {

    @Override

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**");

    }

   

}
/*
package com.portfolio.arg;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class WebConfig{
    Connection connect = null;
     public Connection conexion()
     {
     try{
            Class.forName("org.gjt.mm.mysql.Driver");
             connect = DriverManager.getConnection("jdbc:mysql://localhost/backendarg", "root","");
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Error " );
     }
     return connect; 
     }
}
*/