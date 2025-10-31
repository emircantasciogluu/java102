package nested;

public class Local {
    public void run() {

        // Local Class
        class LocalInner {
            private int a;

            public LocalInner(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        LocalInner localObj = new LocalInner(12);
        System.out.println("Local class executed.");
        System.out.println(localObj.getA());
    }
}