import java.util.HashMap;
import java.util.List;
public class Main {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Смирнов Константин ");
    }
    public static void addInPhoneBook() {
        phoneBook.put("Петров Иван ", List.of("+7(921)1t1-17-17", "+7(905)211-25-43"));
        phoneBook.put("Кузьмин Игорь ", List.of("+7(911)353-34-32", "+7(803)748-43-11"));
        phoneBook.put("Смирнов Константин ",List.of("+7(546)565-85-52", "+7(457)841-60-64"));
        phoneBook.put("Ветров Геннадий ",List.of("+7(877)087-82-11", "+7(347)648-09-63"));
    }
    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}