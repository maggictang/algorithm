/**
 * 
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。然后用
 * printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数
 * 的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中率或者学生的考试分数
 * 制成表格。
 */

class Student {
	private String name;
	private int a;
	private int b;
	private double c;

	public Student(String name,int a,int b) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = (double)((int)((double)a/b*1000))/1000;
	}

	public String toString() {
		return name + "---" + a + "---" + b + "---" + c;

	}
}
public class TableTest {
	public static void main(String[] args) {
		Student[] stu = new Student[10];
		try {
			if(args.length%3 != 0) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("请按格式，三个一组输入");
		}		
		for(int i = 0; i < args.length; i=i+3) {
			String name = args[i];
			int a = Integer.parseInt(args[i+1]);
			int b = Integer.parseInt(args[i+2]);	
			Student s = new Student(name,a,b);	
			stu[i/3] = s;
		}
		for(Student t : stu) {
			System.out.println(t);
		}
	}
}
