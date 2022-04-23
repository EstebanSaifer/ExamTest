package Fifth;

public class PersonArray {
    private Person[] arr;
    public PersonArray(int count, String name, int age) {
        Person[] arr = new Person[count];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Person(name,age);
        }
    }
}
