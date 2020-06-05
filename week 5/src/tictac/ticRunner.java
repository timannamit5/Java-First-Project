package tictac;

public class ticRunner {

	public void tic() throws InterruptedException {
		synchronized(this) {for(int i=0;i<10;i++)
		{
			System.out.print("tic");
			wait();
			notifyAll();
		}		
	}}

	public void tac() throws InterruptedException {
		synchronized(this){for(int i=0;i<10;i++)
		{
			System.out.println("tac");
			notifyAll();
			wait();
		}		
	}}

}
