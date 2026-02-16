public class Student extends Person {
    
    private String studentId;
    private String classLevel;
    
    private double latestGPA;

    public Student(String name, int age, String studentId, String classLevel, String address, double latestGPA) {
        super(name, age, address);
        this.studentId = studentId;
        this.classLevel = classLevel;
       
        this.latestGPA = latestGPA;
    }

   
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }
    public String getClassLevel() {
        return classLevel;
        
    }
   
    public double getLatestGPA() {
        return latestGPA;
    }
    public void setLatestGPA(double latestGPA) {
        this.latestGPA = latestGPA;
    }
    @Override
    public String toString() {
      return super.toString() +
       " Student ID: " + studentId + "\n"+
       " Class Level: " + classLevel + "\n"+
       " Latest GPA: " + latestGPA;
    }
}