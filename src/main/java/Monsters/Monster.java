package Monsters;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;

public class Monster {
	
	
	String[] EnemyFirst=new String[]{"The Evil","The Mad","The Big","The Dangerous","Captain","The Ghostly","Professor","Doctor","Phantom","The Brutal","The Unstoppable","The Vile","The Dark","The Crazy","The Iron","The Poison","The Berserker","The Bloody","The King","The Violent","The Rancid","The Invisible","The Black","The Atomic","The Mega","The Grand"};
	String[] inimigoPrimeiroNome=new String[]{"O Malevolo","O Insano","O Grande","O Perigoso","Capitão","O Fantasmagórico","Professor","Doutor","Fantasma","O Brutal","O Imparável","O Vilão","O Obscuro","O Maluco","","O Venenoso","O Fulminante","O Sangrento","O Rei","O Violento","O Rançoso","O Invisível","O Negro","O Atômico","O Mega"," O Grande"};
	
	String[] EnemyLast=new String[]{"Shadow","Knight","Tarantula","Skull","Mastermind","Wizard","Ninja","Devil","Freak","Beast","Criminal","Master","Lord","Child","Corpse","Slayer","Spider","Creature","Werewolf","Monster","Vampire","Mutant","Robot","Claw","Machine","Clown"};
	String[] inimigoUltimoNome=new String[]{"Sombra","Cavaleiro","Tarantula","Caveira","Mestre da Mente","Feiticeiro","Ninja","Demônio","Enlouquecido","Fera","Crimimoso","Mestre","Senhor","Criança","Corpo","Fatiador","Aranha","Criatura","Lobisomem","Monstro","Vampiro","Mutante","Robô","Garra","Máquina","Palhaço"};

	@Getter @Setter private String MonsterName;
	
	@Getter @Setter private int life;
	@Getter @Setter private int attack;
	@Getter @Setter private int mana;
	@Getter @Setter private int experience;
	@Getter @Setter private int gold;
	
	
	public String generateRandomMonsterName()
	{	
		Random r=new Random();
		this.MonsterName=EnemyFirst[r.nextInt(25)]+" "+EnemyLast[r.nextInt(25)];
		return this.MonsterName;		
	}
	
	public String geraNomeMonstro()
	{	
		Random r=new Random();
		this.MonsterName=inimigoPrimeiroNome[r.nextInt(25)]+" "+inimigoUltimoNome[r.nextInt(25)];
		return this.MonsterName;		
	}
	
	public void generateStats()
	{	
		Random r=new Random();
		this.life=r.nextInt(200)+15;
		this.attack=r.nextInt(20)+1;
		this.mana=r.nextInt(80);
		this.experience=r.nextInt(15)+10;
		this.gold=r.nextInt(200);
				
	}

}
