import java.util.Random;

public class Employee {


     private String firstName;
     private String lastName;
     private Integer age;
     private Double salary;
     private Integer Id;

     public Employee(String firstName,String lastName,Integer age,Double salary) {

          this.firstName= firstName;
          this.lastName= lastName;
          this.age  = age;
          this.salary=salary;
          this.Id= Id;

     }

     public void SetId(Integer id) {
          this.Id=id;
     }
     public Integer GetId() {
          return this.Id;
     }
     public double GetSalary() {
          return this.salary;
     }
     public void SetSalary(Double salary) {
           this.salary=salary;
     }
}
