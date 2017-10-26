package com.mvcoperaciones.model;

public class OperacionesMatematicas {

	private float fNumero1;
	private float fNumero2;
	public float getfNumero1() {
		return fNumero1;
	}
	public void setfNumero1(float fNumero1) {
		this.fNumero1 = fNumero1;
	}
	public float getfNumero2() {
		return fNumero2;
	}
	public void setfNumero2(float fNumero2) {
		this.fNumero2 = fNumero2;
	}
	
public float sumar()
{
	return fNumero1+fNumero2;
}
public float restar()
{
	return fNumero1-fNumero2;
}
public float multiplicar()
{
	return fNumero1*fNumero2;
}
public float dividir()
{
	return fNumero1/fNumero2;
}
}
