import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.poll();
            if (client.spendTicket()) {
                queue.offer(client);
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
