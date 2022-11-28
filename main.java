import java.util.Scanner;

public class main {

//tests the constructor
    static void testConstructor() {

        System.out.println("Creating a set with 5 elements");

        IntergerSet set = new IntergerSet(5);

        set.display();

        System.out.println("Test completed");

    }

//tests the add method

    static void testAdd() {

        IntergerSet set = new IntergerSet();

        set.display();

        System.out.println("Adding elements from 1 to 10 to set");

        for (int i = 1; i <= 10; i++) {

            set.add(i);

        }

        set.display();

        System.out.println("Trying to add 5");

        if (set.add(5)) {

            System.out.println("5 is added, test failed!");

        } else {

            System.out.println("5 is not added, test success!");

        }

        System.out.println("Trying to add 7");

        if (set.add(7)) {

            System.out.println("7 is added, test failed!");

        } else {

            System.out.println("7 is not added, test success!");

        }

        System.out.println("Trying to add 11");

        if (set.add(11)) {

            System.out.println("11 is added, test success!");

        } else {

            System.out.println("11 is not added, test failed!");

        }

        set.display();

        System.out.println("Test completed");

    }

//tests the remove method

    static void testRemove() {

        IntergerSet set = new IntergerSet();

        set.display();

        System.out.println("Adding elements from 1 to 10 to set");

        for (int i = 1; i <= 10; i++) {

            set.add(i);

        }

        set.display();

        System.out.println("Removing elements from 1 to 10 from set");

        for (int i = 1; i <= 10; i++) {

            set.remove(i);

        }

        set.display();

        System.out.println("Test completed");

    }

//tests the size method

    static void testSize() {

        IntergerSet set = new IntergerSet();

        System.out.println("Set size: " + set.size());

        System.out.println("Adding elements from 1 to 10 to set");

        for (int i = 1; i <= 10; i++) {

            set.add(i);

            System.out.println("Set size: " + set.size());

        }

        set.display();

        System.out.println("Adding 5");

        set.add(5);

        System.out.println("Set size: " + set.size());

        System.out.println("Adding 7");

        set.add(7);

        System.out.println("Set size: " + set.size());

        System.out.println("Adding 11");

        set.add(11);

        System.out.println("Set size: " + set.size());

        System.out.println("Test completed");

    }

//tests the isEmpty method

    static void testEmpty() {

        IntergerSet set = new IntergerSet();

        System.out.println("Set isEmpty(): " + set.isEmpty());

        System.out.println("Adding elements from 1 to 10 to set");

        for (int i = 1; i <= 10; i++) {

            set.add(i);

        }

        set.display();

        System.out.println("Set isEmpty(): " + set.isEmpty());

        System.out.println("removing elements from 1 to 10 from set");

        for (int i = 1; i <= 10; i++) {

            set.remove(i);

        }

        set.display();

        System.out.println("Set isEmpty(): " + set.isEmpty());

        System.out.println("Test completed");

    }

//tests the isMember method

    static void testIsMember() {

        IntergerSet set = new IntergerSet();

        System.out.println("Adding elements from 1 to 10 to set");

        for (int i = 1; i <= 10; i++) {

            set.add(i);

        }

        System.out.println("is Member(5): " + set.isMember(5));

        System.out.println("is Member(2): " + set.isMember(2));

        System.out.println("is Member(15): " + set.isMember(15));

        System.out.println("Test completed");

    }

//tests the isSubset method

    static void testSubset() {

        IntergerSet set1 = new IntergerSet();

        IntergerSet set2 = new IntergerSet();

        System.out.println("Adding elements from 1 to 10 to set1");

        for (int i = 1; i <= 10; i++) {

            set1.add(i);

        }

        System.out.println("Adding elements from 5 to 10 to set2");

        for (int i = 5; i <= 10; i++) {

            set2.add(i);

        }

        System.out.println("Set 1: ");

        set1.display();

        System.out.println("Set 2: ");

        set2.display();

        System.out.println("set1.isSubset(set2): " + set1.isSubset(set2));

        System.out.println("Adding 11 to set2");

        set2.add(11);

        System.out.println("Set 2: ");

        set2.display();

        System.out.println("set1.isSubset(set2): " + set1.isSubset(set2));

        System.out.println("Test completed");

    }

//tests the intersection method

    static void testIntersection() {

        IntergerSet set1 = new IntergerSet();

        IntergerSet set2 = new IntergerSet();

        System.out.println("Adding elements from 1 to 10 to set1");

        for (int i = 1; i <= 10; i++) {

            set1.add(i);

        }

        System.out.println("Adding elements from 5 to 15 to set2");

        for (int i = 5; i <= 15; i++) {

            set2.add(i);

        }

        System.out.println("Set 1 intersection Set 2: ");

        set1.intersection(set2).display();

        System.out.println("Test completed");

    }

//tests the union method

    static void testUnion() {

        IntergerSet set1 = new IntergerSet();

        IntergerSet set2 = new IntergerSet();

        System.out.println("Adding elements from 1 to 10 to set1");

        for (int i = 1; i <= 10; i++) {

            set1.add(i);

        }

        System.out.println("Adding elements from 5 to 15 to set2");

        for (int i = 5; i <= 15; i++) {

            set2.add(i);

        }

        System.out.println("Set 1 union Set 2: ");

        set1.union(set2).display();

        System.out.println("Test completed");

    }

//tests the difference method

    static void testDifference() {

        IntergerSet set1 = new IntergerSet();

        IntergerSet set2 = new IntergerSet();

        System.out.println("Adding elements from 1 to 10 to set1");

        for (int i = 1; i <= 10; i++) {

            set1.add(i);

        }

        System.out.println("Adding elements from 5 to 15 to set2");

        for (int i = 5; i <= 15; i++) {

            set2.add(i);

        }

        System.out.println("Set 1 difference Set 2: ");

        set1.difference(set2).display();

        System.out.println("Test completed");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

//loops until user decides to quit

        while (!quit) {

//displaying options

            System.out.println("\n1. Test constructor");

            System.out.println("2. Test add()");

            System.out.println("3. Test size()");

            System.out.println("4. Test isEmpty()");

            System.out.println("5. Test isMember()");

            System.out.println("6. Test remove()");

            System.out.println("7. Test union()");

            System.out.println("8. Test intersection()");

            System.out.println("9. Test difference()");

            System.out.println("10. Test subset()");

            System.out.println("0. Quit");

            System.out.print("Your choice: ");

//getting choice and handling choice

            int choice = scanner.nextInt();

            switch (choice) {

                case 0:

                    quit = true;

                    break;

                case 1:

                    testConstructor();

                    break;

                case 2:

                    testAdd();

                    break;

                case 3:

                    testSize();

                    break;

                case 4:

                    testEmpty();

                    break;

                case 5:

                    testIsMember();

                    break;

                case 6:

                    testRemove();

                    break;

                case 7:

                    testUnion();

                    break;

                case 8:

                    testIntersection();

                    break;

                case 9:

                    testDifference();

                    break;

                case 10:

                    testSubset();

                    break;

            }

        }

    }

}