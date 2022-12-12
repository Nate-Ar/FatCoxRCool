
import java.util.LinkedList;
import java.util.Random;
class List {
    static void BuildLinklists(LinkedList<Integer>[] arrList, LinkedList<Integer> L) {
        for(int i=0; i<L.size(); i++) {
            int x = L.get(i);
            int r = x % 10;
            arrList[r].add(x);
        }
    }
    public static void main (String[] args) {
        LinkedList<Integer> L = new LinkedList<Integer>();
        Random r = new Random();
        for(int i=0; i<20; i++) {
            int x = r.nextInt(100);
            L.add(x);
        }
        System.out.println(L);
        LinkedList<Integer> [] arrList = new LinkedList[10];
        for(int i=0; i<10; i++) {arrList[i] = new LinkedList<Integer>();}
        BuildLinklists(arrList, L);
        for(int i=0; i<10; i++) {System.out.println(arrList[i]);}
    }
}
