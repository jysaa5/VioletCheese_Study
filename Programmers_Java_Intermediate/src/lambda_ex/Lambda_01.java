package lambda_ex;

//람다식
public class Lambda_01 {

	public static void main(String[] args) {

		//Runnable 생성
		//Thread 생성
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("hello");
				}

			}

		}).start();

	}

}
