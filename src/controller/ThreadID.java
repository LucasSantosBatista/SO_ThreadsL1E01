
package controller;

/**
 * @author Lucas Batista
 * 16 de mar. de 2024
 */
public class ThreadID extends Thread {

	private int id;
	
	public ThreadID(int idThread) {
		this.id = (int) getId();
	}

	public void run() {
		System.out.println("#"+id);
	}
}
