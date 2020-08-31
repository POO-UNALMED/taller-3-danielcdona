package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV = 0;
	
	
	TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	Marca getMarca() {
		return marca;
	}
	
	void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	Control getControl() {
		return control;
	}
	
	void setControl(Control control) {
		this.control = control;
	}
	
	int getPrecio() {
		return precio;
	}
	
	void setPrecio(int precio) {
		this.precio = precio;
	}
	
	int getVolumen() {
		return volumen;
	}
	
	void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	int getCanal() {
		return canal;
	}
	
	void setCanal(int canal) {
		this.canal = canal;
	}
	
	void turnOn() {
		estado = true;
	}
	
	void turnOff() {
		estado = false;
	}
	
	boolean getEstado() {
		return estado;
	}
	
	void canalUp() {
		if (canal <120) {
			canal++;	
		}
		
	}
	
	void canalDown() {
		if (canal>1) {
			canal--;
		}
	}
	
	void volumenUp() {
		if (volumen<7 && (estado = true)) {
			volumen++;
		}	
		
	}
	
	void volumenDown() {
		if (volumen>0 && (estado = true)) {
			volumen--;
		}	
	}
	
	void setNumTV(int num){
		numTV = num;
	}
	
	static int getNumtv() {
		return numTV;
	}

}
