
public class Main {
    static Employee[] employees = new Employee[10];

    public static void printSeparator() {
        System.out.println("===================================================================");
    }

    // печать списка
    public static void printListOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    // сумма затрат на ЗП в месяц
    public static int totalSalaryOnMonth() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    // найти сотрудника с минимальной зарплатой
    public static void employeeWithMinimalSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == minSalary) {

                System.out.println(employees [i]);
            }
        }
    }


    // найти сотрудника с максимальной зарплатой
    public static Employee employeeWithMaximalSalary() {
        Employee maxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary.getSalary() < employees[i].getSalary()) {
                maxSalary = employees[i];
            }

        }return maxSalary;
    }
    // вывести список сотрудников ФИО
    public static void printListOfEmployeesEmpty () {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + ". " + employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName());
        }
    }
    // подсчитать среднее зачение зарплат
    public static double  middleSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum / employees.length;
    }


    public static void main(String[] args) {


        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 25000);
        employees[1] = new Employee("Петров", "Петр", "Васильевич", 2, 31000);
        employees[2] = new Employee("Николаев", "Александр", "Борисович", 3, 25000);
        employees[3] = new Employee("Борисов", "Борис", "Петрович", 4, 43000);
        employees[4] = new Employee("Иванова", "Мария", "Петровна", 5, 34600);
        employees[5] = new Employee("Кучук", "Игорь", "Константинович", 1, 50500);
        employees[6] = new Employee("Петрова", "Галина", "Викторовна", 3, 43000);
        employees[7] = new Employee("Денисов", "Илья", "Иванович", 5, 41000);
        employees[8] = new Employee("Кукушкина", "Марфа", "Васильевна", 2, 42000);
        employees[9] = new Employee("Борисов", "Борис", "Борисович", 1, 51000);

        printSeparator();
        System.out.println("Список сотрудников со всеми данными:");
        printSeparator();

        printListOfEmployees();

        printSeparator();

        totalSalaryOnMonth();

        System.out.println("Сумма затрат на ЗП в месяц: " + totalSalaryOnMonth() + " руб.");
        printSeparator();
        System.out.println("Минимальная заработная плата у сотрудника:");

        employeeWithMinimalSalary();
        printSeparator();
        System.out.println("Максимальная заработная плата у сотрудника:");
        System.out.println(employeeWithMaximalSalary());
        printSeparator();
        System.out.println("Среднее значение зарплат:");
        // так было System.out.println((totalSalaryOnMonth() / employees.length) + " руб. ");
        System.out.println(middleSalary() + " руб."); // так стало )))))
        printSeparator();
        System.out.println("Список сотрудников");
        printListOfEmployeesEmpty();
        printSeparator();


    }


}