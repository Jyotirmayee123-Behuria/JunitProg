import java.util.ArrayList;

public class PersonnelSystem {

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    private Integer GetAutoIncrementNumber() {

        if (employees.size() == 0) return 1;
        var last = employees.get(employees.size() - 1);

        return last.GetId() + 1;
    }

    public void AddEmployee(Employee employee) {

        employee.SetId(GetAutoIncrementNumber());
        employees.add(employee);
    }

    public ArrayList<Employee> GetAllEmployee() {
        return employees;
    }

    public void RemoveEmployee(Employee employee) {
        employees.remove(employee);


    }

    private boolean SalaryHikePercentInRange(double percentage) {

        if(percentage==100.00 || percentage<5.0) return false;

        return true;
    }

    public void RaiseSalaryForSpecificEmployee(int empId,double percentage)
    {
        //If in Range
        if(SalaryHikePercentInRange(percentage))
        {
            //Find the employee
            for(Employee employee:employees)
            {
                if(employee.GetId()==empId) {
                    double prevSalary=employee.GetSalary();
                    double increment = (percentage* employee.GetSalary()) /100 ;
                    employee.SetSalary(prevSalary + increment);
                }
            }
        }
    }
    public void RaiseEmployeeSalary(double percentage) {
        if (SalaryHikePercentInRange(percentage))
        {
            for (Employee emp : employees)
            {
                double increment = (percentage * emp.GetSalary()) / 100;
                emp.SetSalary(emp.GetSalary() + increment);
            }

        }
    }
}