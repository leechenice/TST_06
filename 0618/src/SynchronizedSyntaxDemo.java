public class SynchronizedSyntaxDemo {
    public synchronized void method() {

    }
    public static synchronized void staticMethod() {

    }
    public void otherMethod(){
        Object o = new Object();
        //not null
        synchronized(o){

        }
        synchronized(this){

        }
        synchronized(SynchronizedSyntaxDemo.class) {

        }
    }
}
