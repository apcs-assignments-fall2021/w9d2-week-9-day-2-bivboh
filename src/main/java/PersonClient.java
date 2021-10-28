public class PersonClient {


    public static void main(String[] args) {
        Person bob = new Person("Susie", "childs");
        System.out.println(bob.getFirst_name() + " " + bob.getLast_name());
        bob.setFirst_name("Milan");
        bob.setLast_name("Boga");
        System.out.println(bob.getFirst_name() + " " + bob.getLast_name());
    }
}