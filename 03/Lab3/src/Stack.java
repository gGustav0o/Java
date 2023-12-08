
public class Stack {

    private enum ERROR_CODE{
        STACK_IS_FULL,
        STACK_IS_EMPTY
    }

    @Override
    public String toString() {
        return "Stack{" + "size='" + size + '}';
    }
    private int size, lastElementIndex;

    private Object[] stack;

    public Stack(int size){
        this.size = size;
        lastElementIndex = -1;
        stack = new Object[size];
    }

    public int getSize(){
        return size;
    }
    public int getLastElementIndex(){
        return lastElementIndex;
    }
    public boolean isEmpty() {
        return lastElementIndex == -1;
    }
    public boolean isFull() {
        return lastElementIndex == size - 1;
    }

    private void reportAnError(ERROR_CODE errorCode){
        switch (errorCode){
            case STACK_IS_FULL  -> System.err.println("Stack is full");
            case STACK_IS_EMPTY -> System.err.println("Stack is empty");
        }
    }
    public Object pop(){
        if (lastElementIndex == -1){
            reportAnError(ERROR_CODE.STACK_IS_EMPTY);
            return null;
        }
        Object returnElement = stack[lastElementIndex];
        stack[lastElementIndex] = null;
        lastElementIndex--;
        return returnElement;
    }

    public int push(Object object){
        if(lastElementIndex == size - 1){
            reportAnError(ERROR_CODE.STACK_IS_FULL);
            return -1;
        }
        lastElementIndex++;
        stack[lastElementIndex] = object;
        return lastElementIndex;
    }
}
