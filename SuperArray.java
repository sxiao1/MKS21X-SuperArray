public class SuperArray{
	private String[] data = new String[10];
	private int size;
	public void clear(){
		data = new String[0];
	}
	public int size(){
		int count = 0;
		for(int x = 0; x < data.length; x++){
			if (data[x] != null){
				count ++;
			}
		}
		return count;
	}
	public boolean add(String newstr){
		int firstNull = 10;
		int other = 0;
		for(int x = 0; x < data.length; x++){
			if (data[x] == null){
				other = x;
			}
			if(other < firstNull){
				firstNull = other;
			}
		}
		if (firstNull == 10){
			return false;
		}
		else{
			data[firstNull] = newstr;
			return true;
		}
	}
	public String get(int index){
		String s = data[index];
		return s;
	}
	public String set(int index, String element){
		String s = data[index];
		data[index] = element;
		return s;
	}
}
