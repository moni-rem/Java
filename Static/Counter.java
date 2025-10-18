package selfStudy.Static;

public class Counter {

    private static int count = 0;
    private static int ActiveCount = 0;

    public Counter(){
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static int getActiveCount() {
        return ActiveCount;
    }
//    @Override
//    protected void finalize() throws Throwable {
//        activeInstances--;  // runs when GC collects the object
//        super.finalize();
//    }
    //reset the data to 0
     public void reset(){
        count = 0;
    }
 //   track total numbr of active instances
    public void track(){
        ActiveCount++;
    }
    public static void main(String[] args) {
        //create saveral counter object
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getCount());
        //After reset
        c.reset();
        System.out.println(Counter.getCount());
           c.track();
           c2.track();
           c3.track();
         System.out.println("Active: " + Counter.getActiveCount());
    }
}
