public class ScopeDemo {
        int z;
        void doStuff()
        { int z = 5;
            doStuff2();
            System.out.println(z);
        }
        void doStuff2() {
          int  z=4;
            System.out.println(z);
        }
        public static void main(String args[]){
            ScopeDemo myScope;
            myScope = new ScopeDemo();
            int z = 6;
            System.out.println(z);
            myScope.doStuff();
            System.out.println(z);
            myScope.doStuff2();
        }
}
