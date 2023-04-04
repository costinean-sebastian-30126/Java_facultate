/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab6.exercise1;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class grade_manangment_sys {
    private ArrayList<Student> students;
    public grade_manangment_sys()
    {
        students = new ArrayList<Student>();
    }
   public void addStudent(Student student)
   {
       students.add(student);
   }

   
}
