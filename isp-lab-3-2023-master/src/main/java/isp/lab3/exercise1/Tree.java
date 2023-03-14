/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise1;



/**
 *
 * @author User
 */
 class Tree {
    private int height;
    public int meters;

   public Tree(){
       height=15;
   }

    public int getHeight() {
        return height;
    }
public void grow(int meters){
        if(meters>=1)
        this.height+=meters;
    }
    
    @Override
    public String toString() {
        return "Tree{" + "height=" + height + '}';
    }
   
}
