import java.util.*;
public class ColorpenApp{
	public static void main(String[] args){
		Colorpen cp1 =new Colorpen("赤",5);
		cp1.showStatus();
		cp1.write();
		cp1.showStatus();

		Colorpen cp2=new Colorpen();
		cp2.write();
		cp2.showStatus();
	
		Colorpen cp3=new Colorpen("黄");
	  cp2.len=7;
		cp2.showStatus();
	}
}
