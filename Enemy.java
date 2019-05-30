public class Enemy {

	int 	maxHP, HP, damage, regen;
	double 	defense;
	boolean hasBecameMonster;

	public void attack(Player plr) {
		plr.HP -= damage * (1 - plr.defense);
	}

	public void BecomeDragon() {
		damage = 25;
		defense = 0.5;
		maxHP = 200;
		HP = 200;
		regen = 25;
		hasBecameMonster = true;
	}

	public void BecomeTroll() {
		damage = 15;
		defense = 0.0;
		maxHP = 50;
		HP = 50;
		regen = 20;
		hasBecameMonster = true;
	}

	public void BecomeGoblin() {
		damage = 10;
		defense = 0.1;
		maxHP = 20;
		HP = 20;
		regen = 0;
		hasBecameMonster = true;
	}

	public Enemy() {
		damage	= 0;
		defense	= 0.0;
		maxHP	= 0;
		HP		= 0;
		regen	= 0;
		hasBecameMonster = false;
	}

}
