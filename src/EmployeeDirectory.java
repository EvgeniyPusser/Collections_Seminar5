import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

        private List<Employee> employees;

        public EmployeeDirectory() {
            this.employees = new ArrayList<>();
        }

        public void addEmployee(int idNumber, String phoneNumber, String name, int experience) {
            Employee newEmployee = new Employee(idNumber, phoneNumber, name, experience);
            employees.add(newEmployee);
        }

        public List<Employee> findEmployeesByExperience(int experience) {
            List<Employee> result = new ArrayList<>();
            for (Employee emp : employees) {
                if (emp.getExperience() == experience) {
                    result.add(emp);
                }
            }
            return result;
        }

        public List<String> getPhoneNumberByName(String name) {
            List<String> phoneNumbers = new ArrayList<>();
            for (Employee emp : employees) {
                if (emp.getName().equalsIgnoreCase(name)) {
                    phoneNumbers.add(emp.getPhoneNumber());
                }
            }
            return phoneNumbers;
        }

        public Employee findEmployeeById(int idNumber) {
            for (Employee emp : employees) {
                if (emp.getIdNumber() == idNumber) {
                    return emp;
                }
            }
            return null;
        }

    }
