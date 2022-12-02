public class check {
//to store 100 integer
    char data[] = new char[100];
//top of the stack
    int top = -1;
//push item
    void push(char k) {
        top++;
        data[top] = k;
    }
//pop item
    char pop() {
        {
            char ele = data[top];
            top--;
            return ele;
        }
    }
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    boolean isPalindrom(String line) {
        String checkMe = "";
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z'
                    || line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                checkMe += line.charAt(i);
                push(line.charAt(i));
            }
        }
        String reverseString = "";
        while (!isEmpty()) {
            reverseString += pop();
        }
        if (checkMe.equalsIgnoreCase(reverseString)) {
            return true;
        }
        return false;
    }
}
