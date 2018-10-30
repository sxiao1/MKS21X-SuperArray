public class SuperArray{
	private String[] data;
	private int size = 0;
	public SuperArray(){
		data = new String[10];
	}
	public SuperArray(int initialCapacity){
		if (initialCapacity < 0){
			throw new IllegalArgumentException();
		}
		data = new String [initialCapacity];
		size = 0;
	}
	public void clear(){
		data = new String[0];
		size = 0;
	}
	public int size(){
		return size;
	}
	public String get(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		String s = data[index];
		return s;
	}
	public String set(int index, String element){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		String s = data[index];
		data[index] = element;
		return s;
	}
	public String toString(){
		String str = "[";
		for(int x = 0; x < data.length; x ++){
			if(data[x] != null){
				str+= data[x] + ",";
			}
			if(size != 0 && x + 1 == data.length){
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
		if (size == data.length){
			resize();
		}
		data[size] = newstr;
		size ++;
		return (data[size - 1] == newstr);
	}
	public void resize(){
		SuperArray newary = new SuperArray(data.length * 2);
		for (int x = 0; x < data.length; x++){
			newary.data[x] = data[x];
		}
		data = newary.data;
	}
	public boolean isEmpty(){
		return (size == 0);
	}
	public void add(int index, String element){
		if(index >= data.length|| index < 0){
			throw new IndexOutOfBoundsException();
		}
		for(int x = size - index + 1; x > index; x--){
			if(data.length == size){
				resize();
			}
			data[x] = data[x-1];
		}
		size ++;
		set(index, element);
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
		int tempindex = data.length;
		for(int x = 0; x < data.length; x++){
			if (data[x] == target){
				tempindex = x;
			}
			if(tempindex < index){
				index = tempindex;
			}
		}
		if(index == data.length){
			return -1;
		}
		return index;
	}
	public int lastIndexOf(String target){
		int index = -1;
		int tempindex = -2;
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
		if (index == -1){
			throw new IndexOutOfBoundsException();
		}
		for(int x = index; x < data.length - 1; x++){
			data[x] = data[x+1];
		}
		size --;
		return element;
	}
	public boolean remove(String element){
		int index = indexOf(element);
		if (index >= data.length || index < 0){
			return false;
		}
		size --;
		for(int x = index; x < size; x++){
			data[x] = data[x + 1];
		}
		return true;
	}
}
