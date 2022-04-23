package Fifth;

public class PersonArray {
    private PersonArray[] arr;

    public PersonArray(int count, String name, int age) {
        Person[] person = new Person[count];
        for(int i = 0; i< person.length; i++) {
            person[i] = new Person(name,age);
        }
    }
}
