import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> deque = new LinkedList<>(generateClients());
        while (!deque.isEmpty()) {
            Person client = deque.pollFirst();
            if (client.numberOfTickets > 0) {
                System.out.println(client.name + " " + client.surname + " прокатился на атракционе!");
                client.numberOfTickets--;
                deque.offerLast(client);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Пётр", "Петров", 5));
        personList.add(new Person("Иван", "Иванов", 7));
        personList.add(new Person("Сергей", "Сидоров", 11));
        personList.add(new Person("Андрей", "Попов", 9));
        personList.add(new Person("Николай", "Федоров", 3));

        return personList;
    }
}
