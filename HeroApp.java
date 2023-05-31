public class HeroApp{
	public static void main(String[] args){
		//Heroインスタンスの生成
		Hero h1=new Hero();
		h1.name="そうめん";
		h1.hp=100;

		Hero h2=new Hero();
		h2.name="鳥白湯";
		h2.hp=80;

    Matango ma=new Matango();
		ma.hp=20;
		ma.suffix='A';

		Matango mb=new Matango();
		mb.hp=20;
		mb.suffix='B';

    Matango[] ms=new Matango[3];
		ms[0]=ma;	
		ms[1]=mb;
		ms[2]=new Matango();
		ms[2].hp=30;
		ms[2].suffix='C';

		for(Matango m:ms){
			m.run();
		}


		h1.slip();
		h2.slip();
		h1.sit(3);
		h1.sleep();
	  h1.run();
		h2.run();
		
	}
}
