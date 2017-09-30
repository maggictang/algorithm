

public class Suanfa {
	public static void main(String[] args) { 
		
	}
	
	

	/**
	 * 数组练习。编写一段程序，创建一个 N×N 的布尔数组 a[][]。其中当 i 和 j 互质时（没有相同
	 * 因子），a[i][j] 为 true，否则为 false。
	 */
	public static void prime(int m,int n) {
		boolean[][] a = new boolean[m][n];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(i==0 || j ==0) {
					a[i][j] = false;
				} 
				else if(i==1 || j==1) {
					a[i][j] = true;
				}
				else if(isPrime2(i)&&isPrime(j)) {
					a[i][j] = true;
				}
				else {
					a[i][j] = false;
				}
			}
		}
		
	}
	/**
	 * 判断是否为质数
	 */
	public static boolean isPrime2(int a) {
		boolean c = false;
		for(int i = 2; i < a; i++) {
			if((a % i) == 0) { 
		         c =  false ;  
			}
			else {
				c =  true;
			}
		}
		return c;
		
	}
	


	/**
	 * 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小
	 * 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
	 * 之间，返回数组中所有元素之和应该和 a.length 相等。
	 */
	public static int[] Rehistogram(int[] a,int m) {
		int[] b = new int[m];
		for(int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		return b;
	}	
	/**
	 * 编写一个静态方法 histogram()，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小
	 * 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
	 * 之间，返回数组中所有元素之和应该和 a.length 相等。
	 */
	public static int[] histogram(int[] a,int m) {
		int[] b = new int[m];
		for(int i = 0; i < b.length; i++) {
			int k = 0; 
			for(int j = 0; j < a.length; j++) {
				if(i == a[j]) {
					k++;
				}
			}
			b[i] = k;
		}
		return b;
	}

	/**
	 * 编写一段代码，打印出一个 M 行 N 列的二维数组的转置（交换行和列）。
	 */
	public static void trans(int[][] a,int[][] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}
		}
	}
	/**
	 * 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
	 */
	public static void binary(int n) {
		String s ="";
		while(n > 0) {
			s = (n % 2) + s;
			n = n / 2;
		}

		System.out.println(s);
	}

	/**
	 * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
	 */
	public static void isEquls(int a,int b,int c) {
		boolean i = false;
		i = a==b?(a==c?true:false):false;
		if(i == true) {
			System.out.println("equals");
		} 
		else {
			System.out.println("not equals");
		}
	}

	/**
	 * 计算两个非负整数 p 和 q 的最大公约数：若
	 * q 是 0，则最大公约数为 p。否则，将 p 除以
	 * q 得到余数 r，p 和 q 的最大公约数即为 q 和
	 * r 的最大公约数
	 */
	public static int gcd(int p,int q) {

		if(p < 0 || q < 0) {
			System.out.println("p或q不能为0");
			return -1;
		}
		if(q == 0) {
			return p;
		} 
		else {
			int r = p % q;
			return gcd(q,r);		
		}

	}
	/**
	 * 找出数组中最大的元素
	 */
	public static int max(int[] a) {
		int max = a[0];
		for(int i = 1; i <= a.length-1; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	/**
	 * 计算数组平均值
	 * @return 
	 */
	public static int avg(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return (sum/a.length);
	}
	/**
	 * 复制数组
	 */
	public static int[] copy(int[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = a[i];
		}
		return b;		
	}
	/**
	 * 颠倒数组的顺序
	 */
	public static int[] reversal(int[] a) {
		int[] b = new int[a.length]; 
		for(int i = 0; i<a.length; i++) {
			b[a.length-1-i] = a[i];
		}
		return b;
	}
	/**
	 * 计算一个整数的绝对值
	 */
	public static int abs(int a) {
		if(a>=0) {
			return a;
		}
		else {
			return -(a);
		}	
	}
	/**
	 * 判断一个数是否是素数
	 * 在大于1的整数中，只能被1和这个数本身整除的数
	 */
	public static boolean isPrime(int a) {
		boolean c = true;
		if(a<2) {
			c = false;
		}
		for(int i=2;i<=a-1;a++) {
			if(a%i == 0) {
				c = false;
				break;
			}
		}
		return c;
	}
	/**
	 * 用递归实现二分法查找,返回该数在数组中的索引
	 * @return 
	 */
	public static int find(int num,int[] a,int start,int end) {
		if(start > end) {
			return -1;
		}
		int middle = (start + end) / 2;
		if(num == a[middle]) {
			return middle;
		}
		else {
			if(num < a[middle]) {
				end = middle - 1;
				return find(num,a,start,end);
			} 
			else {
				start = middle + 1;
				return find(num,a,start,end);
			}

		}
	}
	/**
	 * 调用前面的方法
	 */
	public static int find(int num,int[] a) {
		return find(num,a,0,a.length-1);
	}
	/**
	 * 随机返回 [a,b) 之间的一个 int 值
	 */
	public static int random(int a,int b) { 
		int c = 0;
		if(a > b) {
			c = a - b;
			c = (int)Math.random() * c + b;
		}
		if(a < b) {
			c = b - a;
			c = (int)Math.random() * c + a;
		}
		return c;
	}
	/**
	 * 随机返回 [0..N) 之间的一个 int 值
	 */
	public static int random(int n) {
		return (int)Math.random()*n;
	}
}
