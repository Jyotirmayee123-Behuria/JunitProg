import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Lab1EmployeeTest {

// TODO: 2021-02-12 want to see comparing object values

    @Test
    public void createEmployeeTest() {
        //Arrange
        Employee employee=new Employee("Jyoti","Behuria",40,12000.00);
        PersonnelSystem employeeService=new PersonnelSystem();
        //Act
        employeeService.AddEmployee(employee);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        //Assert
        Assertions.assertEquals(employee, employees.get(0));
    }
    @Test
    public void getListsOfEmployeeTest() {
        Employee employeeFirst=new Employee("Jyoti","Behuria",40,12000.00);
        PersonnelSystem employeeService=new PersonnelSystem();
        employeeService.AddEmployee(employeeFirst);
        Employee employeeSecond=new Employee("Jyoti","Behuria",40,12000.00);
        employeeService.AddEmployee(employeeSecond);
        System.out.println(employeeFirst.GetId());
        System.out.println(employeeSecond.GetId());
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        Assertions.assertSame(employees.size(),2);
    }
@Test
    public void addEmployeeTest() {
        //Arrange
        Employee employee=new Employee("Test F","Test L",34,128900.00);
        PersonnelSystem employeeService=new PersonnelSystem();
        //Act
        employeeService.AddEmployee(employee);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        Employee actual=employees.get(0);
        //Assert
        Assertions.assertEquals(employee, actual);
    }
@Test
    public void raiseSalaryForSpecificEmployeeTest() {
        //Arrange
        PersonnelSystem employeeService=new PersonnelSystem();
        Employee employeeFirst=new Employee("Jyoti","Behuria",40,12000.00);
        Double prevSalary=12000.00;
        //Add employee
        employeeService.AddEmployee(employeeFirst);
        Employee employeeSecond=new Employee("Robert","Nilsson",40,10000.00);
        employeeService.AddEmployee(employeeSecond);
        Integer empId=employeeSecond.GetId();
        System.out.println("empid" + empId);
        //Act
        employeeService.RaiseSalaryForSpecificEmployee(employeeSecond.GetId(),10.0);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        Employee employee= employees.get(1);
        System.out.println("empid" + employee.GetId() + "Salary :" +employee.GetSalary());
        //Assert
        Assertions.assertEquals(11000,employee.GetSalary());
    }

    @Test
    public void removeEmployeeTestsWithCount() {
        //Arrange
        PersonnelSystem employeeService=new PersonnelSystem();
        Employee employeeFirst=new Employee("Jyoti","Behuria",40,40000.0);
        employeeService.AddEmployee(employeeFirst);
        Employee employeeSecond=new Employee("Subhasini","Penumutsa",37,50000.0);
        employeeService.AddEmployee(employeeSecond);
        //Act
        employeeService.RemoveEmployee(employeeFirst);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        //Assert
        Assertions.assertEquals(1,employees.size());
    }
    @Test
    public void RaiseAllEmployeeSalaryTest() {
        //Arrange
        PersonnelSystem employeeService=new PersonnelSystem();
        Employee employeeFirst=new Employee("Jyoti","Behuria",40,40000.0);
        Employee employeeSecoond=new Employee("Robert","Nillson",34,8000.0);
        employeeService.AddEmployee(employeeFirst);
        employeeService.AddEmployee(employeeSecoond);
        //Act
        employeeService.RaiseEmployeeSalary(10.0);
        ArrayList<Employee> employess=employeeService.GetAllEmployee();
        Double employeeFirstSalary=  employess.get(0).GetSalary();
        Double employeeSecondSalary=  employess.get(1).GetSalary();
        //Assert
        Double employeeFirstSalaryExpected=44000.0;
        Double employeeSecondSalaryExpected=8800.0;
        Assertions.assertEquals(employeeFirstSalary,employeeFirstSalaryExpected);
        Assertions.assertEquals(employeeSecondSalary,employeeSecondSalaryExpected);
    }

@Test
    public void CheckSalaryPercentageRangeMaxHundredNotAllowedTest()
    {
        //Arrange
        Employee employee=new Employee("Jyoti","Behuria",40,40000.0);
        PersonnelSystem employeeService=new PersonnelSystem();
        employeeService.AddEmployee(employee);
        //Act
        employeeService.RaiseSalaryForSpecificEmployee(employee.GetId(),100.00);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        Double salary=employees.get(0).GetSalary();
        //Assert
        Assertions.assertEquals(salary,40000.0);
    }
    @Test
    public void CheckSalaryPercentageRangeMinHundredNotAllowedTest()
    {
        //Arrange
        Employee employee=new Employee("Jyoti","Behuria",40,40000.0);
        PersonnelSystem employeeService=new PersonnelSystem();
        employeeService.AddEmployee(employee);
        //Act
        employeeService.RaiseSalaryForSpecificEmployee(employee.GetId(),4);
        ArrayList<Employee> employees=employeeService.GetAllEmployee();
        Double salary=employees.get(0).GetSalary();
        //Assert
        Assertions.assertEquals(salary,40000.0);
    }
}