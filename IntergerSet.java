import java.util.Scanner;
public class IntergerSet {
// pointer to head node
        private Node head;
// cardinality
        private int count;
// default constructor
        public IntergerSet() {
            head = null;
            count = 0;
        }
// constructor taking initial size, and ask for size elements
        public IntergerSet(int size) {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
// adding size unique elements to set
            while (i < size) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (!add(num)) {
                    System.out.println("That number already added, try another!");
                } else {
                    i++;
                }
            }
        }
// method to add a value to set
        public boolean add(int item) {
            if (isMember(item)) {
// already exists
                return false;
            }
            if (head == null) {
// adding as head node
                head = new Node(item);
                count++;
                return true;
            }
// finding last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
// appending to last
            temp.next = new Node(item);
            count++;
            return true;
        }
        public int size() {
            return count;
        }
        public boolean isEmpty() {
            return count == 0;
        }
// returns true if item is a member of this set
        public boolean isMember(int item) {
            Node temp = head;
// loops until the end
            while (temp != null) {
                if (temp.data == item) {
// found
                    return true;
                }
// next node
                temp = temp.next;
            }
// not found
            return false;
        }
// removes a value from set if exists
        public boolean remove(int item) {
            if (!isMember(item)) {
// not exists
                return false;
            }
            if (head.data == item) {
// removing head node
                head = head.next;
                count--;
                return true;
            }
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == item) {
// found, removing node between temp and temp.next.next
                    temp.next = temp.next.next;
                    count--;
                    break;
                }
            }
            return true;
        }
// returns true if all elements in set2 exists on this set
        public boolean isSubset(IntergerSet set2) {
            Node temp = set2.head;
            while (temp != null) {
                if (!isMember(temp.data)) {
// current element in set2 does not exist in this set
                    return false;
                }
                temp = temp.next;
            }
// is subset
            return true;
        }
// returns the union of all unique elements in this set and set2
        public IntergerSet union(IntergerSet set2) {
            IntergerSet set = new IntergerSet();
            Node temp = this.head;
// adding all elements of this set to result set
            while (temp != null) {
                set.add(temp.data);
                temp = temp.next;
            }
            temp = set2.head;
// adding all elements of set2 to result set, duplicates will be handled
// by add method
            while (temp != null) {
                set.add(temp.data);
                temp = temp.next;
            }
            return set;
        }
// returns the intersection of elements in both sets
        public IntergerSet intersection(IntergerSet set2) {
            IntergerSet set = new IntergerSet();
            Node temp = this.head;
            while (temp != null) {
                if (set2.isMember(temp.data)) {
// temp.data is member of this set and set2
                    set.add(temp.data);
                }
                temp = temp.next;
            }
            return set;
        }
// returns the difference of elements in both sets
        public IntergerSet difference(IntergerSet set2) {
            IntergerSet set = new IntergerSet();
            Node temp = this.head;
            while (temp != null) {
                if (!set2.isMember(temp.data)) {
// temp.data is member of this set and not a member of set2
                    set.add(temp.data);
                }
                temp = temp.next;
            }
            return set;
        }
// displays the set
        public void display() {
            Node temp = head;
            System.out.print("Set [");
            for (int i = 0; i < count; i++) {
                System.out.print(temp.data);
                if (i != count - 1)
                    System.out.print(", ");
                }
                temp = temp.next;
            System.out.println("]");
        }
// Node class representing each node in set
        private static class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
            }
        }
    }