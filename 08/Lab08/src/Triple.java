public class Triple<T>{
    private T first, second, third;

    public Triple() {}

    public Triple(T first, T second, T third) {
        this.first  = first;
        this.second = second;
        this.third  = third;
    }

    public T getFirst() {
        return this.first;
    }
    public T getSecond() {
        return this.second;
    }

    public T getThird(){
        return this.third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T min() throws NotComparableException {
        if (Comparable.class.isAssignableFrom(first.getClass())){
            T min = first;
            if ((((Comparable)first).compareTo((Comparable)second) < 0)
                    && (((Comparable)first).compareTo((Comparable)third) < 0)) return first;
            else
                if ((((Comparable)second).compareTo((Comparable)third) < 0)
                        && (((Comparable)second).compareTo((Comparable)first) < 0)) return second;
           return third;

        } else {
            throw new NotComparableException("Type is not comparable", first.getClass());
        }
    }

    public T mean() throws NotComparableException{
        if (Comparable.class.isAssignableFrom(first.getClass())){
            T mean = first;
            if (
                    (((Comparable)second).compareTo((Comparable)first) < 0)
                    && (((Comparable)first).compareTo((Comparable)third) < 0)
                    || (((Comparable)third).compareTo((Comparable)first) < 0)
                    && (((Comparable)first).compareTo((Comparable)second) < 0)
            ) return first;

            if (
                    (((Comparable)first).compareTo((Comparable)second) < 0)
                    && (((Comparable)second).compareTo((Comparable)third) < 0)
                    || (((Comparable)third).compareTo((Comparable)second) < 0)
                    && (((Comparable)second).compareTo((Comparable)first) < 0)
            ) return second;

            return third;

        } else {
            throw new NotComparableException("Type is not comparable", first.getClass());
        }
    }

    public T max() throws NotComparableException{
        if (Comparable.class.isAssignableFrom(first.getClass())){
            T max = first;
            if (((Comparable)max).compareTo((Comparable)second) < 0) max = second;
            if (((Comparable)max).compareTo((Comparable)third) < 0)  max = third;
            return max;
        } else {
            throw new NotComparableException("Type is not comparable", first.getClass());
        }
    }

}

class NotComparableException extends Exception{
    private Class T;
    public Class getT(){return T;}
    public NotComparableException(String message, Class T){
        super(message);
        this.T = T;
    }
}
