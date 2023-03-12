package com.hoainong.bai1;

public class ModelTamGiac {
	private double a,b,c;
	public ModelTamGiac() {
		
	}
	public ModelTamGiac(double a, double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double chuVi() {
		return a+b+c;
	}
	public double DienTich() {
		return Math.sqrt(chuVi()*(a+b-c)*(a+c-b)*(b+c-a))/4;
		
	}
}
