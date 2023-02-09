package Interview;

class Threading implements Runnable {
	public void run() {
		System.out.println("Thrada Running");
	}

}
class Dog{
	public static void main(String[] args) {
		Threading t=new Threading();
		Thread t1=new Thread(t);
		t1.start();
	}
}
