import java.util.TreeSet;

class TreeSetExample{
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>()
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
    }
}
