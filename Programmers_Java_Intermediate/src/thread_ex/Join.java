package thread_ex;

public class Join {
	
	public static void main(String[] args) {
		//스레드가 메인이랑 Ex_53_MyThread: 총 2개이다.
		MyThread thread = new MyThread();
		thread.start();
		
		System.out.println("시작");
		
		try {
			//이 스레드가 다 실행되고 멈출때까지 다른 스레드가 기다려준다.
			thread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("종료");
		
	}

}
