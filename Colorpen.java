public class Colorpen{
	//フィールド
	String color;
	int len;
	//コンストラクタ
	public Colorpen(){
		this("白",10);
	}
	public Colorpen(String color,int len){
		//自クラスのコンストラクタの呼び出し
		//下記のthis.color=color;
		//this()は必ず１行目にある必要がある
		this(color);
		this.len=len;
	}
	public Colorpen(String color){
		this.color=color;
	}
	//メソッド
  public void write(){
	  if(this.len==0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.len--;
	}
	public void showStatus(){
		String str="";
		for(int i=0;i<this.len;i++){
			str+="=";
		}
		str+=">";
		str+="("+this.color+")";
		System.out.println(str);
	}
}
