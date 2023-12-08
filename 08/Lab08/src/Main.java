
public class Main {
    public static void main(String[] args) {
        Triple<Integer> t = new Triple<Integer>(1500, 36000, 7000);
        try {
            System.out.println(t.mean());
        } catch (NotComparableException e){
            e.printStackTrace();
        }
    }
}

