package capitulo9_ejercicios_resueltos;

class Producer extends Thread {
	private CubbyHole cubbyhole;
	private int number;
	public Producer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			cubbyhole.put(i);
			System.out.println("Productor #" + this.number + " pone: " + i);
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}