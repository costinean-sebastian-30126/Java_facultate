package isp.lab6.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Student s1 = new Student("Bogdan", "UTCN");
                s1.addGrades("Math",10.00);
       grade_manangment_sys g1 = new grade_manangment_sys();
       
       g1.addStudent(s1);
       
          Student s2 = new Student("Elena", "UBB");
                s2.addGrades("Biology",8.22);
         g1.addStudent(s2);
         
         
         Student s3 = new Student("Alex", "UTCN");
                s3.addGrades("Fizica",7.5);
          g1.addStudent(s3);
          
          System.out.println(s1.toString());
          System.out.println(s2.toString());
          System.out.println(s3.toString());
    }
}
