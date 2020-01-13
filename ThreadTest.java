import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

	private int j;
	
	private Lock lock = new ReentrantLock();
	
	public static void main(String[] args)
	{
		ThreadTest tt = new ThreadTest();
		
		for (int i=0; i< 2; i++)
		{
			new Thread(tt.new Addor()).start();
			new Thread(tt.new Subtractor()).start();
		}
	}
	
	private synchronized void inc()
	{
		j++;
		System.out.println(Thread.currentThread().getName()+" - inc: "+j);
	}
	
	private synchronized void dec()
	{
		j--;
		System.out.println(Thread.currentThread().getName()+" - dec: "+j);
	}
	
	private class Subtractor implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (j< 10 && j >= 0)
			{
				dec();
					
			}
			
		}
		
	}
	
	private class Addor implements Runnable
	{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (j < 10 && j >= 0)
			{
				inc();
					
			}
			
		}
		
	}
	
	
}
