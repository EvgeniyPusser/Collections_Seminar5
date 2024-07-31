import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        Collection<Integer>collection = List.of(1, 2,3,4,5,6);
//
//        Iterator<Integer>iterator= collection.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }
//        System.out.println();
//
//        for (Integer value : collection) {
//            System.out.print(value + " ");
//
//        }
//        System.out.println();
//
//        collection.stream()
//                .forEach((value -> System.out.print(value + " ")));
//        System.out.println();
//        collection.stream().forEach((System.out::print));

//List<Employee> employees = new ArrayList<>();

//Employee emp2 = new Employee(2, "+1 236 2345432", "Sidney True", 12);
//Employee emp3 = new Employee(3, "+1 264 2345432", "Trump", 14);
//Employee emp4 = new Employee(13, "+1 098 2345432", "Eric Clapton", 16);
//Employee emp5 = new Employee(9, "+1 234 2568764", "Johny Depp", 8);
//Employee emp6 = new Employee(99, "+1 234 2092019", "Peter Piper", 20);
//Employee emp7 = new Employee(4, "+1 234 2123456", "Vasiliy Raskin", 7);
//Employee emp8 = new Employee(6, "+1 987 7867563", "Johny Depp", 4);
//Employee emp9 = new Employee(7, "+1 111 2987645", "Johny Depp", 6);
//Employee emp10 = new Employee(1, "+1 333 1000001", "Erick Tormozoff", 17);

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

