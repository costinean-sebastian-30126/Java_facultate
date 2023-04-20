/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author User
 */
public class TenantAlreadyExistException extends Exception{
   
    public TenantAlreadyExistException(String msg){
        super(msg);
    }
    
}
