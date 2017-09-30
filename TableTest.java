/**
 * 
 * ��дһ�γ��򣬴ӱ�׼���밴�ж�ȡ���ݣ�����ÿ�ж�����һ�����ֺ�����������Ȼ����
 * printf() ��ӡһ�ű��ÿ�е����������ݰ������֡����������͵�һ���������Եڶ�������
 * �Ľ������ȷ��С�������λ�����������ֳ��򽫰������ֵĻ��������ʻ���ѧ���Ŀ��Է���
 * �Ƴɱ��
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
			System.out.println("�밴��ʽ������һ������");
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
