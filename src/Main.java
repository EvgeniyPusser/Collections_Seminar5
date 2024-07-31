import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(1, "123-456-7890", "Alice", 5);
        directory.addEmployee(2, "098-765-4321", "Bob", 10);
        directory.addEmployee(3, "555-555-5555", "Charlie", 5);

        // Поиск сотрудников по стажу
        System.out.println("Employees with 5 years of experience:");
        for (Employee emp : directory.findEmployeesByExperience(5)) {
            System.out.println(emp);
        }

        // Получение номера телефона по имени
        System.out.println("\nPhone numbers for 'Alice':");
        for (String phone : directory.getPhoneNumberByName("Alice")) {
            System.out.println(phone);
        }

        // Поиск сотрудника по табельному номеру
        System.out.println("\nEmployee with ID 2:");
        Employee emp = directory.findEmployeeById(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }
    }
}

