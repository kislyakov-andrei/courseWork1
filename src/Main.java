
public class Main {
    static Employee[] employees = new Employee[10];

    public static void printSeparator() {
        System.out.println("===================================================================");
    }

    // печать списка
    public static void printListOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // сумма затрат на ЗП в месяц
    public static int totalSalaryOnMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    // сумма затрат на ЗП по отделу в месяц
    public static int totalSalaryOfDepartmentOnMonth(int numberOfDepartment) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                sum += employee.getSalary();
            }

        }
        return sum;

    }

    // найти сотрудника с минимальной зарплатой
    public static void employeeWithMinimalSalary() {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary) {

                System.out.println(employee);
            }
        }
    }


    // найти сотрудника с максимальной зарплатой
    public static Employee employeeWithMaximalSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }

        }
        return maxSalary;
    }

    // средняя  ЗП
    public static double middleSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.length;
    }

    // средняя зарплата по отделу
    public static double middleSalaryOfDepartment(int numberOfDepartment) {
        int sum = 0;
        int quantityEmployeesOfDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                quantityEmployeesOfDepartment += 1;
                sum += employee.getSalary();
            }

        }
        return sum / quantityEmployeesOfDepartment;

    }

    // найти сотрудника отдела с минимальной зарплатой
    public static Employee employeeOfDepartmentWithMinimalSalary(int numberOfDepartment) {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment && minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    // найти сотрудника отдела с максимальной зарплатой
    public static Employee employeeOfDepartmentWithMaximalSalary(int numberOfDepartment) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment && maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }

        }
        return maxSalary;
    }

    // вывести список сотрудников отдела
    public static void printListOfDepartmentEmployeesEmpty(int numberOfDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                System.out.println(employee.getId() + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " - ЗП - " + employee.getSalary());
            }
        }
    }

    // вывести список сотрудников ФИО
    public static void printListOfEmployeesEmpty() {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }

    // повысить зарплату на процент
    public static void increaseSalaryPercent(double increasePercent) {
        double increaseSalary;
        for (Employee employee : employees) {
            increaseSalary = employee.getSalary() + employee.getSalary() * increasePercent / 100;
            employee.setSalary(increaseSalary);
            System.out.println(employee);

        }

    }
    // повысить зарплату отделу на процент

    public static void increaseSalaryOfDepartmentPercent(int numberOfDepartment, double increasePercent) {
        double increaseSalary;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numberOfDepartment) {
                increaseSalary = employee.getSalary() + employee.getSalary() * increasePercent / 100;
                employee.setSalary(increaseSalary);
                System.out.println(employee);
            }
        }
    }


    // сотрудники с зарплатой  меньше числа
    public static void employeesSalaryLessThan(int sizeOfMinimalSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < sizeOfMinimalSalary) {
                System.out.println(employee.getId() + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " - " + employee.getSalary());
            }
        }
    }

    // сотрудники с зарплатой больше числа
    public static void employeesSalaryMoreThan(int sizeOfMaximalSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= sizeOfMaximalSalary) {
                System.out.println(employee.getId() + ". " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " - " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {


        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 25000);


        employees[1] = new Employee("Петров", "Петр", "Васильевич", 2, 31000);


        employees[2] = new Employee("Николаев", "Александр", "Борисович", 3, 25000);

        employees[3] = new Employee("Борисов", "Борис", "Петрович", 4, 43000);

        employees[4] = new Employee("Иванова", "Мария", "Петровна", 5, 34600);

        employees[5] = new Employee("Кучук", "Игорь", "Константинович", 1, 50500);

        employees[6] = new Employee("Петрова", "Галина", "Викторовна", 3, 43000);

        employees[7] = new Employee("Денисов", "Илья", "Иванович", 5, 51000);

        employees[8] = new Employee("Кукушкина", "Марфа", "Васильевна", 2, 42000);

        employees[9] = new Employee("Борисов", "Борис", "Борисович", 1, 51000);

        printSeparator();
        System.out.println("Список сотрудников со всеми данными:");

        printSeparator();

        printListOfEmployees();

        printSeparator();

        totalSalaryOnMonth();

        System.out.println("Сумма затрат на ЗП в месяц: " +

                totalSalaryOnMonth() + " руб.");

        printSeparator();
        System.out.println("Минимальная заработная плата у сотрудника:");

        employeeWithMinimalSalary();

        printSeparator();
        System.out.println("Максимальная заработная плата у сотрудника:");
        System.out.println(

                employeeWithMaximalSalary());

        printSeparator();
        System.out.println("Среднее значение зарплат:");
        System.out.println(middleSalary() + " руб. ");

        printSeparator();
        System.out.println("Список сотрудников");

        printListOfEmployeesEmpty();

        printSeparator();

        double increasePercent = 5;
        System.out.println("Проиндексировать зарплату сотрудников на " + increasePercent + " %");
        increaseSalaryPercent(increasePercent);
        int numberOfDepartment = 3;

        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой в отделе №" + numberOfDepartment + ": " + employeeOfDepartmentWithMaximalSalary(numberOfDepartment));
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой в отделе №" + numberOfDepartment + ": " + employeeOfDepartmentWithMinimalSalary(numberOfDepartment));
        printSeparator();
        System.out.println("Средняя зарплата по отделу " + numberOfDepartment + ": " + middleSalaryOfDepartment(numberOfDepartment));
        printSeparator();
        System.out.println("Сумма затрат на зарплату отдела №" + numberOfDepartment + " - " + totalSalaryOfDepartmentOnMonth(numberOfDepartment) + " руб.");
        printSeparator();
        increasePercent=10;
        System.out.println("Повысить ЗП сотрудников " + numberOfDepartment + " отдела на " + increasePercent + " процентов");
        increaseSalaryOfDepartmentPercent(numberOfDepartment, increasePercent);
        printSeparator();
        System.out.println("Список сотрудников отдела №" + numberOfDepartment);
        printListOfDepartmentEmployeesEmpty(numberOfDepartment);
        printSeparator();
        int sizeOfMinimalSalary = 35000;
        System.out.println("Сотрудники с заработной платой меньше - " + sizeOfMinimalSalary + " руб.:");
        employeesSalaryLessThan(sizeOfMinimalSalary);
        printSeparator();
        int sizeOfMaximalSalary = 45000;
        System.out.println("Сотрудники с заработной платой больше - " + sizeOfMaximalSalary + " руб.:");
        employeesSalaryMoreThan(sizeOfMaximalSalary);
    }
}

