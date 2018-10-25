public class SuperArray{
	private String[] data = new String[10];
	private int size;
	public void clear(){
		data = new String[0];
	}
	public int size(){
		if (data.length == 0){
			size = 0;
		}
		int tempsz = 0;
		for(int x = 0; x < data.length; x++){
			if (data[x] != null){
				tempsz ++;
			}
		}
		tempsz = size;
		return size;
	}
	public String get(int index){
		if(data.length == 0|| index < 0 || index > data.length - 1){
			return null;
		}
		String s = data[index];
		return s;
	}
	public String set(int index, String element){
		if(data.length == 0){
			return null;
		}
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
		int other = -1;
		for(int x = 0; x < data.length && other == -1; x++){
			if (data[x] == null){
				other = x;
			}
		}
		if (other == -1){
			return false;
		}
		else{
			data[other] = newstr;
			return true;
		}
	}
	public void resize(){
		String [] newdata = new String[data.length * 2];
		for (int x = 0; x < data.length; x++){
			newdata[x] = data[x];
		}
		newdata = data;
	}
	public boolean isEmpty(){
		String element = "";
		for(int x = 0; x < data.length; x++){
			if (data[x] != null){
				element = data[x];
			}
		}
		if (element.equals("")){
			return true;
		}
		else{
			return false;
		}
	}
	public void add(int index, String element){
		if(index >= data.length|| index < 0){
			System.out.println("error");
		}
		if(data.length == size){
			resize();
		}
		for(int x = index + 1; x < data.length; x++){
			data[x] = data[x-1];
		}
	}
	public boolean contains(String target){
		for(int x = 0; x < data.length; x++){
			if (data[x] == target){
				return true;
			}
		}
		return false;
	}
	public int indexOf(String target){
		int index = data.length;
		int tempindex = 0;
		for(int x = 0; x < data.length; x++){
			if (data[x] == target){
				tempindex = x;
			}
			if(tempindex < index){
				tempindex = index;
			}
		}
		return index;
	}
	public int lastIndexOf(String target){
		int index = -1;
		int tempindex = 0; 
		for(int x = 0; x < data.length; x++){
			if (data[x]== target){
				tempindex = x;
			}
			if(tempindex > index){
				index = tempindex;
			}
		}
		return index;
	} 
	public String remove(int index){
		String element = data[index];
		if (index >= data.length || index < 0){
			return "error";
		}
		for(int x = index; x < data.length - 1; x++){
			data[x] = data[x+1];
		}
		return element;
	}
	public boolean remove(String element){
		int index = indexOf(element);
		if (index == data.length){
			return false;
		}
		for(int x = index; index < data.length - 1; x++){
			data[x] = data[x + 1];
		}
		return true;
	}
}
