public class Employee extends Person{
private String employeeId;
private String role;
private double  salary;
public Employee(String name,int age,String address,String employeeId,String role,double  salary ){
    super(name, age, address);
    this.employeeId=employeeId;
    this.role=role;
    this.salary=salary;
}
    public void setRole(String role){
        this.role=role;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getRole() {
        return role;
        
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
        "EmployeeId: "+employeeId+"\n"+
        " Role: "+role+"\n"+
        " Salary: "+salary;
    }
    
}
