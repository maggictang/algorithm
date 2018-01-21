public class StringTest {

	private final char[] value;
	private int hash;

	public StringTest() {
		value = "".toCharArray();
	}

	public StringTest(String value) {
		this.value = value.toCharArray();
	}

	public StringTest(char[] value) {
		this.value = value;
	}

	public StringTest(char[] value,int offset,int count) throws Exception {
		int num = 0;
		if((offset < 0) || (offset >= value.length) || (count < 0) || (count >= value.length)) {
			throw new Exception();
		}
		if((num = count - offset) < 0) {
			throw new Exception();
		}
		char[] c = new char[num+1];
		for(int i = offset,j = 0; i <= count; i++,j++) {
			c[j] = value[i];
		}
		this.value = c;
	}

	public char charAt(int index) {
		if(index < 0 || index >= value.length) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return this.value[index];
	}

	public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) throws Exception {
		if(srcBegin < 0 || srcBegin >= this.value.length || srcEnd < 0 || srcEnd > this.value.length || dstBegin < 0 || dstBegin >= dst.length) {
			throw new Exception();
		}
		for(int i = srcBegin; i <= srcEnd; i++) {
			dst[dstBegin++] = this.value[i];
		}
	}

	public boolean equals(Object anObject) {
		if(anObject == this) {
			return true;
		}
		if(anObject instanceof StringTest) {
			StringTest anotherString = (StringTest) anObject;
			if(anotherString.value.length == this.value.length) {
				for(int i = 0; i < this.value.length; i++) {
					if(anotherString.value[i] != this.value[i]) {
						return false;
					}		
				}
				return true;
			}
			return false;
		}
		return false;

	}

	public boolean equalsIgnoreCase(StringTest anotherString) {
		if(this==anotherString) {
			return true;
		}
		if(anotherString!=null) {
			if(anotherString.value.length == this.value.length) {
				for(int i = 0; i < this.value.length; i++) {
					char aS = anotherString.value[i];
					char tS = this.value[i];	
					if(CharacterTest.isUpperCase(aS)) {
						if(!CharacterTest.isCase(tS)) {
							return false;
						}
						else if(CharacterTest.isUpperCase(tS)) {
							if(aS != tS) {
								return false;
							}
						}
						else if(CharacterTest.isLowerCase(tS)) {
							if((char)(tS - 32) != aS) {
								return false;
							}
						}
					}
					else if(CharacterTest.isLowerCase(aS)) {
						if(!CharacterTest.isCase(tS)) {
							return false;
						}
						else if(CharacterTest.isUpperCase(tS)) {
							if((char)(aS - 32) != tS) {
								return false;
							}
						}
						else if(CharacterTest.isLowerCase(tS)) {
							if(tS != aS) {
								return false;
							}
						}
					}
					else if((CharacterTest.isCase(tS) == false)) {
						if(tS != aS) {
							return false;
						}
					}					
				}
				return true;
			}
			return false;
		}
		return false;
	}

	public int compareTo(StringTest anotherString) {
		int lim = MathTest.min(this.value.length,anotherString.value.length);
		for(int i = 0; i < lim; i++) {
			if(this.value[i] != anotherString.value[i]) {
				return this.value[i] - anotherString.value[i];
			}
		}
		return this.value.length - anotherString.value.length;
	}

	public int compareToIgnoreCase(StringTest anotherString) {
		int lim = MathTest.min(this.value.length,anotherString.value.length);
		for(int i = 0; i < lim; i++) {
			char tV = this.value[i];
			char aV = anotherString.value[i];
			if(CharacterTest.isCase(tV)) {
				if(CharacterTest.isUpperCase(tV)) {
					if(CharacterTest.isLowerCase(aV)) {
						if(aV-32 == tV) {
							break;
						}
						return tV - aV;
					}
					if(tV != aV) {
						return tV - aV;
					}
				}
				else {
					if(CharacterTest.isUpperCase(aV)) {
						if(aV+32 == tV) {
							continue;
						}
						return tV - aV;
					}
					if(tV != aV) {
						return tV - aV;
					}
				}
			}
			else {
				if(tV != aV) {
					return tV - aV;
				}
			}
		}
		return this.value.length - anotherString.value.length;
	}

	public String toString() {
		return String.valueOf(this.value);
	}

	public boolean startsWith(StringTest prefix) {
		int len = prefix.value.length;	
		for(int i = 0; i < len; i++) {
			char pS = prefix.value[i];
			char tS = this.value[i];
			if(pS != tS) {
				return false;
			}
		}
		return true;
	}

	public boolean endsWith(StringTest suffix) {
		int len = this.value.length;
		int slen = suffix.value.length;		
		for(int i = len-1; i >= len - slen; i--) {
			char sS = suffix.value[i-(len-slen)];
			char tS = this.value[i];
			if(sS != tS) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		int h = hash;
		if(h == 0 && this.value.length > 0) {
			for(int i = 0; i < this.value.length; i++) {
				h = 31 * h + this.value[i];
			}
			hash = h;
		}
		return h;
	}

	public int indexOf(int ch, int fromIndex) {		
		final char[] c = this.value;
		if(fromIndex < 0) {
			fromIndex = 0;
		}
		else if(fromIndex >= c.length) {
			return -1;
		}
		for(int i = fromIndex; i < c.length; i++) {
			if(ch == c[i]) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(int ch, int fromIndex) {
		char[] c = this.value;
		if(fromIndex < 0) {
			return -1;
		}
		else {
			fromIndex = c.length - 1;
		}

		for(int i = MathTest.min(fromIndex, c.length - 1); i >= 0; i--) {
			if(c[i] == ch) {
				return i;
			}
		}
		return -1;
	}

	public int indexOf(StringTest str, int fromIndex) {
		char[] ch = this.value;
		if(str.value.length > ch.length) {
			return -1;
		}
		if(fromIndex < 0) {
			fromIndex = 0;
		}
		if(fromIndex >= ch.length) {
			return -1;
		}
		if(str.value.length == 0) {
			return fromIndex;
		}
		//找第一个字符
		for(int i = fromIndex; i < ch.length; i++) {
			if(ch[i] != str.value[0]) {
				while(++i < ch.length && ch[i] != str.value[0]);
			}
			if(i < ch.length) {
				int j = i + 1;
				int end = j + (str.value.length - 2);
				for(int k = str.value[1]; j < end && ch[j] == str.value[k]; j++,k++);
				if(j == end) {
					return i - fromIndex;
				}
			}
		}
		return -1;
	}

	public int lastIndexOf(StringTest str, int fromIndex) {
		char[] ch = this.value;
		char[] sh = str.value;
		//int rightIndex = ch.length - sh.length;
		if(str.value.length > ch.length) {
			return -1;
		}
		if(fromIndex < 0) {
			return -1;
		}
		if(fromIndex >= ch.length) {
			fromIndex = ch.length-1;
		}
		if(sh.length == 0) {
			return fromIndex;
		}
		char strLast = sh[sh.length-1];
		//int min = sh.length - 1;
		//int i = min + fromIndex;
		int i = ch.length-1;
		for(;i >= 0;) {
			if(ch[i] != strLast) {
				while(--i > 0 && ch[i] != strLast);
			}
			if(i < 0) {
				return -1;
			}
			int j = i - 1;
			int start = i - sh.length;
			for(int k = sh.length - 2; j > start && ch[j] == sh[k]; )
			{
				j--;
				k--;	
			};
			if(j != start) {
				return -1;
			} 
			else {
				return j+1;
			}

		}
		return -1;
	}

	public String substring(int beginIndex, int endIndex) throws Exception {
		if(beginIndex < 0) {
			throw new Exception();
		}
		if(endIndex >= this.value.length) {
			throw new Exception();
		}
		if(beginIndex > endIndex) {
			throw new Exception();
		}
		char[] ch = new char[endIndex - beginIndex + 1];
		for(int i = beginIndex,q = 0; i <= endIndex; i++,q++) {
			ch[q] = this.value[i];
		}
		return String.valueOf(ch);
	}

	public String substring(int beginIndex) throws Exception {
		return this.substring(beginIndex, this.value.length-1);
	}
	
	public String concat(StringTest str) {
		int len = str.value.length;
		if(len==0) {
			return String.valueOf(this.value);
		}
		char[] ch = new char[this.value.length + len];
		for(int i = 0; i <= this.value.length - 1; i++) {
			ch[i] = this.value[i];
		}
		for(int i = this.value.length,j = 0; i < ch.length && j < len; i++,j++) {
			ch[i] = str.value[j];
		}
		return String.valueOf(ch);
	}

	public String replace(char oldChar, char newChar) {
		if(oldChar != newChar) {
			char[] ch = new char[this.value.length];
			for(int i = 0; i < this.value.length; i++) {
				ch[i] = (((this.value[i] == oldChar) ? newChar : this.value[i]));
			}
			return String.valueOf(ch);
		}
		return String.valueOf(this.value);
	}

	public boolean isEmpty() {
		return this.value.length == 0;
	}
	
	public boolean contains(StringTest s) {
		return indexOf(s) > -1;
	}
	
	public int indexOf(StringTest s) {
		// TODO 自动生成的方法存根
		return indexOf(s,s.value.length);
	}

	public boolean regionMatches(int toffset, StringTest other, int ooffset, int len) {
		if((toffset < 0) || (ooffset < 0) || (toffset > this.value.length - len) || (ooffset > other.value.length - len) ) {
			return false;
		}
		while(len-- > 0) {
			if(this.value[toffset++] != other.value[ooffset++]) {
				return false;
			}
		}
		return true;
	}

	public String toLowerCase() {
		char[] ch = new char[this.value.length];
		for(int i=0; i < this.value.length; i++) {
			if(CharacterTest.isUpperCase(this.value[i])) {
				ch[i] = (char) (this.value[i]+32);
			}
			else {
				ch[i] = this.value[i];
			}
		}
		return String.valueOf(ch);
	}
	
	public String toUpperCase() {
		char[] ch = new char[this.value.length];
		for(int i=0; i < this.value.length; i++) {
			if(CharacterTest.isLowerCase(this.value[i])) {
				ch[i] = (char) (this.value[i]-32);
			}
			else {
				ch[i] = this.value[i];
			}
		}
		return String.valueOf(ch);
	}
	
	public String trim() throws Exception {
       int st = 0;
       int len = this.value.length - 1;
       while((st < this.value.length) && this.value[st++] != ' ');
       while(((len-1) >= 0) && (this.value[len-1] == ' ')) {
    	len--;   
       }
       return substring(st,len);
    }
	
	public static void main(String[] args) throws Exception {
		StringTest str1 = new StringTest(" HELlo212111");
		//String str2 = str1.trim();
		System.out.println(str1.trim());
	}
}
