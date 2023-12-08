public class Something {
    private int intField;
    private String stringField;
    public Something(int a, String b){
        this.intField = a;
        this.stringField = b;
    }

    void swap(Something that){
        String tempString = this.stringField;
        int tempInt = this.intField;

        this.intField = that.intField;
        this.stringField = that.stringField;

        that.intField = tempInt;
        that.stringField = tempString;
    }

    @Override
    public String toString(){
        return "Something " + stringField + ' ' + intField;
    }
}

