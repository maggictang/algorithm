

public class Suanfa {
	public static void main(String[] args) { 
		
	}
	
	

	/**
	 * ������ϰ����дһ�γ��򣬴���һ�� N��N �Ĳ������� a[][]�����е� i �� j ����ʱ��û����ͬ
	 * ���ӣ���a[i][j] Ϊ true������Ϊ false��
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
	 * �ж��Ƿ�Ϊ����
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
	 * ��дһ����̬���� histogram()������һ���������� a[] ��һ������ M Ϊ����������һ����С
	 * ΪM�����飬���е�i��Ԫ�ص�ֵΪ����i�ڲ��������г��ֵĴ��������a[]�е�ֵ����0��M-1
	 * ֮�䣬��������������Ԫ��֮��Ӧ�ú� a.length ��ȡ�
	 */
	public static int[] Rehistogram(int[] a,int m) {
		int[] b = new int[m];
		for(int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		return b;
	}	
	/**
	 * ��дһ����̬���� histogram()������һ���������� a[] ��һ������ M Ϊ����������һ����С
	 * ΪM�����飬���е�i��Ԫ�ص�ֵΪ����i�ڲ��������г��ֵĴ��������a[]�е�ֵ����0��M-1
	 * ֮�䣬��������������Ԫ��֮��Ӧ�ú� a.length ��ȡ�
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
	 * ��дһ�δ��룬��ӡ��һ�� M �� N �еĶ�ά�����ת�ã������к��У���
	 */
	public static void trans(int[][] a,int[][] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}
		}
	}
	/**
	 * ��дһ�δ��룬��һ�������� N �ö����Ʊ�ʾ��ת��Ϊһ�� String ���͵�ֵ s��
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
	 * ��дһ�����򣬴������еõ���������������������Ƕ�������ӡ equal�������ӡ not equal��
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
	 * ���������Ǹ����� p �� q �����Լ������
	 * q �� 0�������Լ��Ϊ p�����򣬽� p ����
	 * q �õ����� r��p �� q �����Լ����Ϊ q ��
	 * r �����Լ��
	 */
	public static int gcd(int p,int q) {

		if(p < 0 || q < 0) {
			System.out.println("p��q����Ϊ0");
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
	 * �ҳ�����������Ԫ��
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
	 * ��������ƽ��ֵ
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
	 * ��������
	 */
	public static int[] copy(int[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = a[i];
		}
		return b;		
	}
	/**
	 * �ߵ������˳��
	 */
	public static int[] reversal(int[] a) {
		int[] b = new int[a.length]; 
		for(int i = 0; i<a.length; i++) {
			b[a.length-1-i] = a[i];
		}
		return b;
	}
	/**
	 * ����һ�������ľ���ֵ
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
	 * �ж�һ�����Ƿ�������
	 * �ڴ���1�������У�ֻ�ܱ�1�������������������
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
	 * �õݹ�ʵ�ֶ��ַ�����,���ظ����������е�����
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
	 * ����ǰ��ķ���
	 */
	public static int find(int num,int[] a) {
		return find(num,a,0,a.length-1);
	}
	/**
	 * ������� [a,b) ֮���һ�� int ֵ
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
	 * ������� [0..N) ֮���һ�� int ֵ
	 */
	public static int random(int n) {
		return (int)Math.random()*n;
	}
}
