package p03_method;

public class Ex03ConstructorA {
  public static void main(String[] args) {
    Employee employee = new Employee("PJW", 1, "2024-10-10", 29, "female");
    System.out.println(employee.getEname());
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();

  }
}

class Employee {
  {
    System.out.println("Initial Block Instance");
  }
  static {
    System.out.println("Initial Block static");
  }
  private String ename;
  private int empno;
  private String hiredate;
  private int age;
  private String gender;

  public Employee() {

  }

  public Employee(String ename, int empno, String hiredate, int age, String gender) {
    this.ename = ename;
    this.empno = empno;
    this.hiredate = hiredate;
    this.age = age;
    this.gender = gender;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getEmpno() {
    return empno;
  }

  public void setEmpno(int empno) {
    this.empno = empno;
  }

  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }
}

