public class Matango{
	int hp;
	final int LEVEL=10;
	char suffix;

	public void run(){
		System.out.println("お化けキノコ"+this.suffix+"は逃げ出した");
	}
	public void appear(){
		System.out.printf("お化けキノコ%s(%d)が現れた%n",this.suffix,this.hp);
	}
}
