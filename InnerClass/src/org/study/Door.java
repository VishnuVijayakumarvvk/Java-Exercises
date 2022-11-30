package org.study;

public class Door {
	private Lock lock;
	
	public Door() {
		lock=new Lock(true);
	}
	public void IsStatus() {
		if(lock.isLock()) {
			System.out.println("The door is locked");
		}else {
			System.out.println("rhe door is opened");
		}
	}
	
	public class Lock{
		private boolean lock;

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}
}
