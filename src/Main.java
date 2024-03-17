//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
//Задача 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
//Задача 3
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
        }
    }
