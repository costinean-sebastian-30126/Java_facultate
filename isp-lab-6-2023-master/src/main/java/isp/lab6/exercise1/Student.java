/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab6.exercise1;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String University;
    Map<String,Double>studentGrades = new HashMap<>();

    public Student(String name, String University) {
        this.name = name;
        this.University = University;
    }
    
  public void addGrades(String clas,Double grade)
  {
      studentGrades.put(clas,grade);
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public Map<String, Double> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(Map<String, Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", University=" + University + ", studentGrades=" + studentGrades + '}';
    }

}