
public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        //Имя
        String firstName = "Ivan";
        //Отчество
        String middleName = "Ivanovich";
        //Фамилия
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("______________");
        //task 2
        System.out.println("Task 2");
        System.out.println(fullName.toUpperCase());
        System.out.println("______________");
        //task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("______________");
    }
}
