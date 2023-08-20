package view;

import javax.swing.JOptionPane;

import controller.RecursivaN2;

public class Principal {

	public static void main(String[] args) {
		RecursivaN2 rn = new RecursivaN2();
		int n1;
		int n2;
			do {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
				if (n1>=10 && n1<=999999) {
				}else {
					System.out.println("Valor inválido, por favor re-insira");
				}
			}while (n1<10 || n1>999999);
		
			do {
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor valor"));
				if (n2<10 && n2>0) {
				}else {
					System.out.println("Valor inválido, por favor re-insira");
				}
			}while (n2>10 || n2<=0);
			
			
		int result = 0;
		int res = rn.retn(n1, n2, result);
		
		System.out.println(res);

	}

}
