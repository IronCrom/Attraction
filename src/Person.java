public class Person {
    protected String name;
    protected String surname;
    protected int numberOfTickets;

    public Person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public boolean spendTicket() {
        numberOfTickets--;
        if (numberOfTickets > 0) {
            System.out.println(name + " " + surname + " Вы прокатились на атракционе! у Вас осталось " + numberOfTickets + " билетов");
            return true;
        } else {
            System.out.println(name + " " + surname + " Вы израсходовали ПОСЛЕДНИЙ билет!");
            return false;
        }
    }
}
