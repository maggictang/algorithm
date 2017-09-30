import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 从标准输入中得到的一列字符串并记录每个（长度至少达到指定的
 * 阈值）字符串的出现次数，然后遍历所有键并找出出现频率最高的键
 */
public class RepeatCount {
	public static void main(String[] args) {
		//最短字长，小于这个字长不算单词
		int minLen = 2;
		//创建一个字典
		Map<String,Integer> map = new HashMap<String,Integer>();
		//从键盘输入
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			//把读到的字符串给临时变量word
			String word = sc.next();
			//如果字符串长度小于2，退出本次循环，继续下次循环
			if(word.length() <= minLen) {
				continue;
			}
			//如果字典里没有这个键
			if(!map.containsKey(word)) {
				map.put(word, 0);
			}
			else {
				map.put(word, map.get(word)+1);
			}		
			//找出出现次数最多的字符串
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