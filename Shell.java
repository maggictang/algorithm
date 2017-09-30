

public class Shell {
	public static void main(String[] args) {
		int[] a = {1,2,7,9,4,3,6,8,0,5};	
		sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
		
	}
	public static void sort(int[] a) {
		int n = a.length;
		int h = 1;
		while(h<n/3) {
			h = h * 3 + 1;
		}
		while(h>=1) {
			//Ω¯––≤Â»Î≈≈–Ú
			for(int i = h; i < a.length; i = i + h) {
				int temp = a[i];
				int j = 0;
				for(j = i - h; j >= 0; j = j -h) {
					if(a[j] > temp) {
						a[j+h] = a[j];
					}
					else {
						break;
					}
				}
				if(a[j+h] != temp) {
					a[j+h] = temp;
				}
			}
	
			h = h / 3;
		}
	}
}