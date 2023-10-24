package iter;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collect {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        //10, 100, 1
        listOfNumbers.add(10);
        listOfNumbers.add(100);
        listOfNumbers.add(1);

        for (int i : listOfNumbers) {
            System.out.println(listOfNumbers);
        }

        ListIterator<Integer> iterator = listOfNumbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            for (int number : listOfNumbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }


                // use a for each loop to loop and print the values
                //use a ListIterator to loop through and print values
                //Create another for each loop to print ONLY even numbers
                // - if this is NOT possible then use a ListIterator
                //Using a listIterator - print the number sin REVERSE
            }
            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }



        }
    }
}
