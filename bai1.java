/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class bai1 {
    public String tenSanPham;
public double giaSanPham;
public double giamGia;

bai1(){}
bai1(String tenSanPham, double giaSanPham, double giamGia) {
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
		this.giamGia = giamGia;
	}
public double getThueNhapKhau(){
    return giaSanPham*0.1;
}

  void nhapTT() {
		System.out.println("Ten san pham: ");
		tenSanPham = new Scanner(System.in).nextLine();
		System.out.println("Don gia: ");
		giaSanPham = new Scanner(System.in).nextDouble();
		System.out.println("Giam gia: ");
		giamGia = new Scanner(System.in).nextDouble();
		
	}
	
	void xuatTT() {
		System.out.println("Ten san pham: " + tenSanPham);
		System.out.println("Don gia: " + giaSanPham);
		System.out.println("Giam gia: " + giamGia);
	}
	
	public static void main(String[] args) {
		bai1 SP = new bai1();
		SP.nhapTT();
		SP.xuatTT();
                System.out.println("thuế"+SP.getThueNhapKhau());
	}
}
