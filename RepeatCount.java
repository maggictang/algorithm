import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * �ӱ�׼�����еõ���һ���ַ�������¼ÿ�����������ٴﵽָ����
 * ��ֵ���ַ����ĳ��ִ�����Ȼ��������м����ҳ�����Ƶ����ߵļ�
 */
public class RepeatCount {
	public static void main(String[] args) {
		//����ֳ���С������ֳ����㵥��
		int minLen = 2;
		//����һ���ֵ�
		Map<String,Integer> map = new HashMap<String,Integer>();
		//�Ӽ�������
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			//�Ѷ������ַ�������ʱ����word
			String word = sc.next();
			//����ַ�������С��2���˳�����ѭ���������´�ѭ��
			if(word.length() <= minLen) {
				continue;
			}
			//����ֵ���û�������
			if(!map.containsKey(word)) {
				map.put(word, 0);
			}
			else {
				map.put(word, map.get(word)+1);
			}		
			//�ҳ����ִ��������ַ���
			String max = "";
			map.put(max, 0);
			for(String s : map.keySet()) {
				if(map.get(max) < map.get(s)) {
					max = s;
				}
			}
			System.out.println(max + "---" + map.get(max));
		}
	}	
}