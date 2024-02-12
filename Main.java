package Test.Task_Phone_Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Показать контакт");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Выход");
            System.out.print("Введите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    Integer phone = scanner.nextInt();
                    myPhoneBook.add(name, phone);
                    break;
                case 3:
                    System.out.print("Введите имя для удаления: ");
                    String removeName = scanner.nextLine();
                    System.out.print("Введите номер телефона для удаления: ");
                    String removePhone = scanner.nextLine();
                    myPhoneBook.delete(removeName);
                    break;
                case 2:
                    PhoneBook.getPhoneBook();
                    break;
                case 4:
                    System.out.println("----");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор пункта меню.");
            }

        }
    }
}