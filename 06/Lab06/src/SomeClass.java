public class SomeClass {
        private int someField;
        public SomeClass(int someField){
            this.someField = someField;
        }
        int getSomeField(){
            return someField;
        }

        void setSomeField(int someField){
            this.someField = someField;
        }
        private int someMethod(){
            return someField * someField;
        }
}
