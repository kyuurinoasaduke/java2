import java.util.*;
public class ColorpenApp{
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
		System.out.print("何色作成する>>");
		int n=sc.nextInt();
		Colorpen[] pens=new Colorpen[n];
		for(int i=0;i<n;i++){
			System.out.print("色>>");
			String color=sc.next();
			System.out.print("長さ>>");
			int len=sc.nextInt();
			Colorpen cp=new Colorpen(color,len);
			pens[i]=cp;
		}
		while(true){
		for(int i=0;i<pens.length;i++){
			System.out.print(i+":");
			pens[i].showStatus();
		}
		System.out.print("色を選択してください>>");
		n=sc.nextInt();
		if(n>=pens.length){
			break;
		}
		pens[n].write();
		}
	}
}
