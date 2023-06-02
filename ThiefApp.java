public class ThiefApp{
	public static void heal(int hp){
		hp+=10;
	}
	public static void heal(Thief thief){
		thief.hp+=10;
	}
	public static void main(String[] args){
		int basehp=25;
		Thief t=new Thief("アサカ",basehp);
		heal(basehp);
		System.out.println(basehp+":"*t.hp);
		heal(t);
		System.out.println(basehp+":"*t.hp);
	}
}
