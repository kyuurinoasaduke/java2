
import java.util.*;
public class SubjectApp{
	public static void main(String[] args){
		//スキャナーインスタンス作成
		Scanner sc=new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int n=sc.nextInt();
		//Subject配列作成
		Subject[] sub=new Subject[n];
		//科目数分回るループ
		for(int i=0;i<sub.length;i++){
			System.out.printf("%d教科目の名前>>",i+1);
			String name=sc.next();
			System.out.printf("%d教科目の得点>>",i+1);
			int score=sc.nextInt();
			//Subjectインスタンス作成
			Subject s=new Subject(name,score);
      //インスタンスを配列に格納
			sub[i]=s;
		}
		//拡張forでそれぞれのインスタンスにアクセス
		for(Subject s:sub){
			//グラフを描画するインスタンスメソッドの実行
			s.showGraph();
		}
	}
}
