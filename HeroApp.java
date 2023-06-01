import java.util.*;
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
			m.appear();
		}
		h1.attack(ms[0]);

		Sword s1=new Sword();
		s.name="麵棒";
		s.damage=10;
    Sword s2=new Sword();
		s.name="すりこ木";
		s.damage=5;
    Sword s3=new Sword();
		s.name="出刃包丁";
		s.damage=15;
		h1.setSword(s);
		h1.attack(ms[0]);

		int sidx=new Random

    Cleric cleric=new Cleric();
		cleric.name="リリー";
		cleric.hp-=20;
		cleric.selfAid();
	  cleric.pray(3);
		h1.slip();
		h2.slip();
		cleric.heal(h1);
		cleric.heal(h2);
		cleric.pray(5);
		h1.sit(3);
		h1.sleep();
	  h1.run();
		h2.run();
		
	}
}
