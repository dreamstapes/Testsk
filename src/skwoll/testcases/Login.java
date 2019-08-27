package skwoll.testcases;

public class Login {

	public static void main(String[] args) {
	  String str="This is a dreams";
	  
//	  String d="This is a stapes";
//	  Object objStr=str;
//	  System.out.println(str.compareTo(d));
//	  System.out.println(str.compareToIgnoreCase(d));
//	  System.out.println(str.compareTo(objStr.toString()));
//	  String s=new String("This is a sapalee");
//	  System.out.println(str.equals(str));
//	  System.out.println(d.equals(s));
//	  System.out.println(str==d);
//	  System.out.println(d==s);
	  int lastIndex = str.lastIndexOf("This");
	  if(lastIndex == -1) {
		  System.out.println("This not found");
	  }else {
		  System.out.println("Last occurrence of This is at index "+lastIndex);
	  }
	}
	
}
