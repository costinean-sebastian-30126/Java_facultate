/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;
import java.util.HashMap;
/**
 *
 * @author User
 */
 public class DoorLockedControler implements ControllerInterface{
    private HashMap<AccesKey, Tenant> validAcces = new HashMap<>();
    private Door door;
    
    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccesKey key = new AccesKey(pin);
        if(validAcces.containsKey(key)){
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
            
        }
        return door.getStatus();
    }
        
    

    @Override
    public void addTenant(String pin, String name) throws Exception {
       validAcces.put(new AccesKey(pin),new Tenant(name));
    }

    @Override
    public void removeTenant(String name) throws Exception {
       
    
}
 }