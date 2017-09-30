import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		random(args);
	
	}
	/**
	 * 从标准输入中获取0 到 1 的实数。，打印出最大和最小的数
	 */
	public static void print(String[] args) {
		double max = 0;
		double min = 1;
		for(int i=0; i<args.length; i++) {
			double temp = Double.parseDouble(args[i]);
			if(max < temp) {
				max = temp;
			}
			if(temp < min) {
				min = temp;
			}
		}
		System.out.print("最大值:" + max + " " + "最小值:" + min);	
	}
	/**
	 * 打印出所有数的中位数
	 */
	public static void middle(String[] args) {
		double[] b = new double[args.length];
		for(int i=0; i<args.length; i++) {
			b[i] = Double.parseDouble(args[i]);
		}
		/**
		 * 插入排序
		 */
		for(int i=1; i<b.length; i++) {
			double temp = b[i];
			int j;
			for(j=i-1; j<i; j--) {
				if(b[j]>temp) {
					b[j+1] = b[j];
				}
				else {
					break;
				}
			}
			if(b[j+1] != temp) {
				b[j+1] = temp;
			}
		}
		int middile = (0 + b.length) / 2;
		System.out.println(b[middile]);
	}
	/**
	 * 打印出第 k 小的数，k 小于 100
	 */
	public static void minK(String[] args,int k) {
		double[] b = new double[k];
		for(int i=0; i<k; i++) {
			b[i] = Double.parseDouble(args[i]);
		}
		/**
		 * 选择排序
		 */
		for(int i=0; i<b.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<b.length; j++) {
				if(b[minIndex]>b[j]) {
					minIndex = j;
				}
				double temp = 0;
				temp = b[minIndex];
				b[minIndex] = b[i];
				b[i] = temp;
			}
		}
		int middle = (0 + k) / 2;
		System.out.println(b[middle]);
	}
	/**
	 * 打印出所有数的平方和
	 */
	public static void squa(String[] args) {
		double[] b = new double[args.length];
		double sum = 0;
		for(int i=0; i<args.length; i++) {
			b[i] = Double.parseDouble(args[i]);
			sum = (b[i]*b[i]) + sum;
		}
		System.out.println(sum);
	}
	/**
	 * 打印出n个数的平均值
	 */
	public static double avg(String[] args,int n) {
		double[] b = new double[n];
		double sum = 0;
		double avg = 0;
		for(int i=0; i<n; i++) {
			b[i] = Double.parseDouble(args[i]);
			sum = b[i] + sum;
		}
		avg = sum / n;
		//System.out.println(avg);
		return avg;
	}
	
	/**
	 *  打印出大于平均值的数的百分比
	 */
	public static void greater(String[] args,int n) {
		double a = avg(args,n);
		int k = 0;
		double[] b = new double[args.length];
		for(int i=0; i<args.length; i++) {
			b[i] = Double.parseDouble(args[i]);
			if(b[i] > a) {
				k++;
			}
		}
		System.out.println(k);
		System.out.println((double)k/args.length);
	}
	/**
	 * 将 N 个数按照升序打印
	 */
	public static void sortPrint(String[] args) {
		double[] b = new double[args.length];
		for(int i=0; i<args.length; i++) {
			b[i] = Double.parseDouble(args[i]);
		}
		for(int i=0; i<b.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<b.length; j++) {
				if(b[minIndex]>b[j]) {
					minIndex = j;
				}
				double temp = 0;
				temp = b[minIndex];
				b[minIndex] = b[i];
				b[i] = temp;
			}
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}	
	}
	/**
	 * 将 N 个数按照随机顺序打印
	 */
	public static void random(String[] args) {
		double[] b = new double[args.length];
		//int n = args.length;
		for(int i=0; i<args.length; i++) {
			b[i] = Double.parseDouble(args[i]);
		}
		Set<Integer> hs = new LinkedHashSet<Integer>();
		while(hs.size() < args.length) {	
			int i = (int) (Math.random()*args.length);
			hs.add(i);
		}
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			System.out.println(b[(Integer) it.next()]);
		}
	}
	
	
}
