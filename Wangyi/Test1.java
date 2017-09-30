package Wangyi;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person(10,"小易");
		isContinue(p);	
	}
	public static void isContinue(Person p) {
		System.out.println("是否增加魔法币");
		System.out.println("yes/no");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		if("yes".equals(temp)) {	
			selectMachine(p);
			isContinue(p);
		}
		else if("no".equals(temp)) {
			System.out.println("小易目前拥有的魔法币数量：" + p.getCoin());
			System.exit(0);
		}
		else {
			System.out.println("输入错误");
			isContinue(p);
		}
		
	}
	
	
	public static void selectMachine(Person p) {
		System.out.println("请选择魔法机器:");
		System.out.println("A.魔法机器1    B。魔法机器2");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		if("A".equals(temp)) {
			System.out.println("请输入魔法币数量:");
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			if(n > p.getCoin()) {
				System.out.println("没有那么多魔法币");
				selectMachine(p);
			}
			else {
				p.opration1(n);
				System.out.println("小易目前拥有的魔法币数量：" + p.getCoin());
			}			
		}
		else if("B".equals(temp)) {
			System.out.println("请输入魔法币数量:");
			Scanner sc2 = new Scanner(System.in);
			int n = sc2.nextInt();
			if(n > p.getCoin()) {
				System.out.println("没有那么多魔法币");
				return;
			}
			else {
				p.opration2(n);
				System.out.println("小易目前拥有的魔法币数量：" + p.getCoin());
			}			
		}
		else {
			System.out.println("输入不正确");
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



