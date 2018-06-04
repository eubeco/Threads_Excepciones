package capitulo9_ejercicios_resueltos;

class ProducerConsumerTest {
	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}
class CubbyHole {
	
	private int contents; // this is the condition variable.
	private boolean available = false;
	
	public synchronized int get() {
		while (available == false) {
			try {
				wait(); //espera una llamada a notify desde el productor
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notify(); // lo notifica al productor
		return contents;
	}
	
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notify();
	}
}