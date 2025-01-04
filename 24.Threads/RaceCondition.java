
// Shared resource is accessed by multiple threads simultaneously
// 



class Counter
{
	int count;
//	public void increment()
    public synchronized void increment()
	{
		count++;
	}
}

public class RaceCondition {
    public static void main(String[] args) {   
    	
    	Counter c = new Counter();
    	
    	Runnable obj1=()->
    	{
            for(int i=1;i<=10000;i++)
    		{
    			c.increment();
				// System.out.println("Thread 1: "+c.count);
    		}
    	};
    	
    	Runnable obj2=()->
    	{
			for(int i=1;i<=10000;i++)
    		{
    			c.increment();
				// System.out.println("Thread 2: "+c.count);
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    	System.out.println(c.count);
    }
}
