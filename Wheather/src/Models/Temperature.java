package Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Markus
 */
public class Temperature {

    public double getCelcius(){
       return 30;
    }
    
    public double getFahrenheit(){
        return getCelcius()*33.8;
    }
    
    public double getKelvin(){
        return getCelcius()*274.15;
    }
            
    
}
