public class ITEmployee extends Employee implements Project{
    String Organization = "xyz";

    public void Project(){
        System.out.println("Employee is currently working on a project");
    }

    public static void main(String[] args) {
        ITEmployee emp = new ITEmployee();
        System.out.println(emp.employeeName);
        System.out.println(emp.employeeId);
        System.out.println("Employee is working in " +emp.Organization);
        emp.Project();
    }

}
