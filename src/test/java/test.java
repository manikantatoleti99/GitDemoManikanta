import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names= new ArrayList<String>();
		names.add("mani");
		names.add("satya");
		names.add("manikanta");
		names.add("niha");
		names.add("money");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("m"))
			{
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
