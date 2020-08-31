package taller3.televisores;

class Control {
	TV tv;
	
	void enlazar(TV tv){
		this.tv = tv;
		this.tv.setControl(this);
	}
	
	void turnOn() {
		tv.turnOn();
	}
	
	void turnOff() {
		tv.turnOff();
	}
	
	void volumenUp() {
		tv.volumenUp();
	}
	
	void volumenDown() {
		tv.volumenDown();
	}
	
	void canalUp() {
		tv.canalUp();
	}
	
	void canalDown() {
		tv.canalDown();
	}
	
	void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	void setTv(TV tv) {
		this.tv = tv;
	}
	
	TV getTv() {
		return tv;
	}

}
