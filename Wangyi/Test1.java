package Wangyi;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person(10,"С��");
		isContinue(p);	
	}
	public static void isContinue(Person p) {
		System.out.println("�Ƿ�����ħ����");
		System.out.println("yes/no");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		if("yes".equals(temp)) {	
			selectMachine(p);
			isContinue(p);
		}
		else if("no".equals(temp)) {
			System.out.println("С��Ŀǰӵ�е�ħ����������" + p.getCoin());
			System.exit(0);
		}
		else {
			System.out.println("�������");
			isContinue(p);
		}
		
	}
	
	
	public static void selectMachine(Person p) {
		System.out.println("��ѡ��ħ������:");
		System.out.println("A.ħ������1    B��ħ������2");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		if("A".equals(temp)) {
			System.out.println("������ħ��������:");
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			if(n > p.getCoin()) {
				System.out.println("û����ô��ħ����");
				selectMachine(p);
			}
			else {
				p.opration1(n);
				System.out.println("С��Ŀǰӵ�е�ħ����������" + p.getCoin());
			}			
		}
		else if("B".equals(temp)) {
			System.out.println("������ħ��������:");
			Scanner sc2 = new Scanner(System.in);
			int n = sc2.nextInt();
			if(n > p.getCoin()) {
				System.out.println("û����ô��ħ����");
				return;
			}
			else {
				p.opration2(n);
				System.out.println("С��Ŀǰӵ�е�ħ����������" + p.getCoin());
			}			
		}
		else {
			System.out.println("���벻��ȷ");
			selectMachine(p);
		}
	}
}

class Person {
	private int coin;
	private String name;

	public Person(int coin,String name) {
		this.coin = coin;
		this.name = name;
	}
	public int getCoin() {
		return this.coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}

	public void opration1(int coin) {
		this.coin = 2 * coin + 1;
	} 

	public void opration2(int coin) {
		this.coin = 2 * coin + 2;
	}
}



