/*Nathan Arter
* 11/28/22
* makes hash table and holds data*/
class HashTable {
    class Node {
        String data;
        //makes ponter
        Node next;
        // initalz the node
        Node(String val) {
            //assign the data of node to val
            this.data = val;
        }
    }
    //makes arrays
    private static Node[] MyNodesArray;
    private int length;
    public HashTable() {
        //initliz the length
        length = 13;
        MyNodesArray = new Node[length];
        for (int i = 0; i < length; i++) {
            MyNodesArray[i] = new Node("Sample_Data");
        }
    }
    //makes insert method
    public void insert(String key) {
        int ascii=0;
        if(key.length()<3){
            for(int i=0;i<key.length();i++){
                ascii+=key.charAt(i);
            }
        }
        else
            ascii=key.charAt(0)+key.charAt(1)+key.charAt(2);
        int indexAt = ascii % length;
        //get the node form the table
        Node currentNode = MyNodesArray[indexAt];
        if (currentNode == null) {
            currentNode=new Node(key);
        }
        else {
            while (currentNode.next != null && !currentNode.next.data.equals(key)) {
                // move to next
                currentNode = currentNode.next;
            }
            if (currentNode.next != null && currentNode.next.data.equals(key)) {
                return;
            }
            else {
                //append the node with key
                currentNode.next = new Node(key);
                return ;
            }
        }
    }
    public static void display(){
        //run the loop till size of array which is 13
        for(int indexAt=0;indexAt<13;indexAt++){
            Node currentNode = MyNodesArray[indexAt];
            //print index of arr
            System.out.print(indexAt+" ");
            //print the element except default value
            while (currentNode!=null )
            {   //if the data is not equals to sample data
                if(!currentNode.data.equals("Sample_Data"))
                    //print the data
                    System.out.print(currentNode.data+" ");
                //move to next
                currentNode = currentNode.next;
            }
            //add a new  line
            System.out.println();
        }
    }
}