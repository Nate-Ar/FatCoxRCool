import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
public class Dec<E extends Comparable<E>> {
    private LinkedList<E> mlist;
    public Dec(){mlist = new LinkedList<>();}
    public ArrayList<E> DuplicateItems(){
        Set<E> set = new HashSet<>();
        ArrayList<E> uniqueList = new ArrayList<>();
        for(int i=0; i<mlist.size(); i++){
            E val = mlist.get(i);
            if(!set.contains(val)){
                uniqueList.add(val);
                set.add(val);
            }
        }
        return uniqueList;
    }
    public boolean isGreater(Dec<E> dec){
        if(mlist.isEmpty() || dec.mlist.isEmpty()){return !mlist.isEmpty();}
        E smallestItemA = mlist.get(0), largestItemA = mlist.get(0), medianItemA = mlist.get(0);
        E smallestItemB = dec.mlist.get(0), largestItemB = dec.mlist.get(0), medianItemB = dec.mlist.get(0);
        for (E val : mlist) {
            int comp = smallestItemA.compareTo(val);
            if (comp > 0) {
                smallestItemA = val;
            }
            comp = largestItemA.compareTo(val);
            if (comp < 0) {
                largestItemA = val;
            }
        }
        int midIdx = mlist.size() % 2 == 0 ? mlist.size()/2 - 1 : mlist.size()/2;
        medianItemA = mlist.get(midIdx);
        for(E val : dec.mlist){
            int comp = smallestItemB.compareTo(val);
            if(comp > 0){smallestItemB = val;}
            comp = largestItemB.compareTo(val);
            if(comp < 0){largestItemB = val;}
        }
        midIdx = dec.mlist.size() % 2 == 0 ? dec.mlist.size()/2 - 1 : dec.mlist.size()/2;
        medianItemB = dec.mlist.get(midIdx);
        return smallestItemA.compareTo(smallestItemB) > 0 && largestItemA.compareTo(largestItemB) > 0 && medianItemA.compareTo(medianItemB) > 0;
    }
    public void insert_second_last(E data){
        if(mlist.size() <= 2){return;}
        mlist.add(mlist.size()-2, data);
    }
    public LinkedList<E> copy(){
        LinkedList<E> deepCopy = new LinkedList<>();
        for(E val : mlist){deepCopy.add(val);}
        return deepCopy;
    }

}