package Fifth;

public class PersonArray {
    private Person[] arr;
    public PersonArray (PersonArray personArray) {
        arr = new Person[personArray.arr.length];
        for(int i = 0; i < personArray.arr.length ;i++) {
            arr[i] = new Person(personArray.arr[i]);
        }
    }
}
