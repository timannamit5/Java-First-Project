package tictac;

public class tictac {
	public static void main(String args[]) 
	{
		ticRunner tr = new ticRunner();
		Thread tic_thread = new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try {
							tr.tic();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				});
		
		Thread tac_thread = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try {
					tr.tac();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}}

		);
		
		tic_thread.start();
		tac_thread.start();
	}
}

