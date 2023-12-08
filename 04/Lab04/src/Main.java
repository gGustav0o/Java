
public class Main {
    public static void main(String[] args) {
        Something a = new Something(5, "A");
        Something b = new Something(10, "B");

        SomrthingWrapper aw = new SomrthingWrapper(a);
        SomrthingWrapper bw = new SomrthingWrapper(b);

        swapSomething(aw, bw);

        System.out.println("a: " + aw.something.toString());
        System.out.println("b: " + bw.something.toString());

        a.swap(b);

        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
     }

    public static void swapSomething(SomrthingWrapper a, SomrthingWrapper b){
        Something temp = a.something;
        a.something = b.something;
        b.something = temp;
    }
}