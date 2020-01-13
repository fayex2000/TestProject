
public class ThreadTest1 {
	
	public static void main(String[] args)
	{
		new ThreadTest1().init();
	}

	public void init()
	{
		final Business business = new Business();
		new Thread (
			new Runnable() {
				public void run() {
					for (int i=0; i<50; i++)
					{
						business.subThread(i);;
					}
				}
			}).start();
		
		for (int i=0; i<50; i++)
		{
			business.mainThread(i);
		}
	}
	
	private class Business
	{
		boolean bShouldSub = true;
		public synchronized void mainThread(int i)
		{
			if (bShouldSub)
			{
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			for (int j=0; j<5; j++)
				System.out.println(Thread.currentThread().getName()+" - i: "+ i + ", j: "+j);
		
			bShouldSub = true;
			this.notify();
			
		}
		
		public synchronized void subThread(int i)
		{
			if (!bShouldSub)
			{
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
				for (int j=0; j<10; j++)
					System.out.println(Thread.currentThread().getName()+" - i: "+ i + ", j: "+j);
			
				bShouldSub = false;
				this.notify();
			
			
		}
		
	}
}
