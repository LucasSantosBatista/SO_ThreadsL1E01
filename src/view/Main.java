/**
 * 
 */
package view;

import controller.ThreadID;

/**
 * @author Lucas Batista
 * 16 de mar. de 2024
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int idThread = 0; idThread < 5; idThread++) {
			ThreadID threadID = new ThreadID(idThread);
			threadID.start();
		}

	}

}
