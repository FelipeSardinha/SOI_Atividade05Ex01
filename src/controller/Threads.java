package controller;
import java.util.concurrent.Semaphore;
public class Threads extends Thread{
	private int id;
	static Semaphore semaphoreDB = new Semaphore(1);
	
	public Threads(int id) {
		this.id = id;
	}
	
	public void run() {
		if (id % 3 == 1) {
			int timeDB = 1000;
			
			int timeCalc = (int) (Math.random() * 800) + 200;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
			
			
			timeCalc = (int) (Math.random() * 800) + 200;
			System.out.println("Thread: " + id + " - executando calculo.");
				try {
					sleep(timeCalc);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}			
		}
		
		if (id % 3 == 2) {
			int timeDB = 1500;
			
			int timeCalc = (int) (Math.random() * 1000) + 500;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
			
			
			timeCalc = (int) (Math.random() * 1000) + 500;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
			

			timeCalc = (int) (Math.random() * 1000) + 500;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
		}
		
		
		if (id % 3 == 0 ) {
			int timeDB = 1500;
			

			int timeCalc = (int) (Math.random() * 1000) + 1000;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
			
			
			timeCalc = (int) (Math.random() * 1000) + 1000;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}
			
			timeCalc = (int) (Math.random() * 1000) + 1000;
			System.out.println("Thread: " + id + " - executando calculo.");
			try {
				sleep(timeCalc);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread: " + id + " - finalizou calculo.");
			
			
			try {
				semaphoreDB.acquire();
				transacaoDB(id, timeDB);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaphoreDB.release();
			}	
		}
	}
	
	public void transacaoDB(int id, int timeDB) {
		System.out.println("Thread: " + id + " - realizando transação no banco de dados.");
		try {
			sleep(timeDB);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread: " + id + " - finalizou a transaçao.");	
	}
}