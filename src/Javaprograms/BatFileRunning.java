package Javaprograms;

import java.io.IOException;

public class BatFileRunning {

	public static void main(String[] a) throws Throwable {


		try {
			Runtime.getRuntime().exec("C:\\Users\\Malempati Parvathi\\Desktop\\original\\JavaPractice\\src\\emulator.bat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		Thread.sleep(6000);


	}

}
