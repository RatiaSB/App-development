public class Stack {
    char[] stack;
    int stackTop;
    int stackCapacity;

    public Stack(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.stack = new char[stackCapacity];
        this.stackTop  = -1;
    }


}
