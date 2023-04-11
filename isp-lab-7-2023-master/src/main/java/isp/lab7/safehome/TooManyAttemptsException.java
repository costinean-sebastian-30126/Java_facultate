/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author User
 */
public class TooManyAttemptsException extends Exception {
    private String msg;
    public TooManyAttemptsException(String msg){
        super(msg);
    }
    
}
