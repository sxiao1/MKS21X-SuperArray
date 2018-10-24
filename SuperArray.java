public class SuperArray{
	private String[] data = new String[10];
	private int size;
	public void clear(){
		data = new String[0];
	}
	public int size(){
		for(int x = 0; x < data.length; x++){
			if (data[x] != null){
				size ++;
			}
		}
		int sz = size;
		return sz;
	}
	public String get(int index){
		if(data.length == 0){
			return null;
		}
		String s = data[index];
		return s;
	}
	public String set(int index, String element){
		String s = data[index];
		data[index] = element;
		return s;
	}
	public String toString(){
		String str= "[";
		for(int x = 0; x < data.length; x ++){
			if(data[x] != null){
				str+= data[x] + ",";
			}
			if(x + 1 == data.length){
				str = str.substring(0, str.length()-1);
			}
		}
		str += "]";
		return str;
	}
	public String toStringDebug(){
		String str= "[";
		for(int x = 0; x < data.length; x ++){
			str+= data[x] + ",";
			if(x+ 1 == data.length){
				str = str.substring(0, str.length()- 1);
			}
		}
		str += "]";
		return str;
	}
	public boolean add(String newstr){
		if (data.length == 0){
			data = new String[10];
		}
		int other = 0;
		for(int x = 0; x < data.length && other == 0; x++){
			if (data[x] == null){
				other = x;
			}
		}
		if (other == 0){
			return false;
		}
		else{
			data[other] = newstr;
			return true;
		}
	}
	public void resize(){
		String [] newdata = new String[data.length + 1];
		for (int x = 0; x < data.length; x++){
			newdata[x] = data[x];
		}
		newdata = data;
	}
	public boolean contains(String target){
		for(int x = 0; x < data.length; x++){
			if (data[x] == target){
				return true;
			}
		}
		return false;
	}
	/*public int indexOf(String target){
		for(int x = 0; x < data.length; x++){
			if (data[x] == target){
				return x;
			}
		}
	}
	public int lastIndexOf(String target){
		int index;
		for(int x = 0; x < data.length; x++){
			if (data[x]== target){
				index = x;
			}
		}
		return index;
	} */

}
