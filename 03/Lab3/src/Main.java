

public class Main {

    public static void main(String[] args) {
        for (String string : args)
            System.out.println(string);

        Stack stack = new Stack(6);

        stack.push(new String("String"));
        stack.push(new String("String1"));
        stack.push(new Stack(1));
        stack.pop();
        stack.push(new Stack(3));
        stack.push(new String("anotherString"));
        stack.pop();
        stack.push(new String("anotherString1"));
        stack.push(new String("AAAAAA"));
        stack.push(new String("not AAAAAA"));
        stack.pop();
        stack.push(new String("mr. Fish"));

        int i = 10;
        while (i != 0){
            stack.pop();
            i--;
        }
    }
}