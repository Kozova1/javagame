public abstract class Enemy {

	public int			maxHP, HP, damage, regen, x, y;
	public double		defense;

	public void regen() {
		HP += regen;
		if (HP > maxHP) {
			HP = maxHP;
		}
	}

	public void attack(World wld) {
		wld.player.HP -= damage * (1 - wld.player.defense);
	}

	public Enemy() {
		damage	= 0;
		defense	= 0.0;
		maxHP	= 0;
		HP		= 0;
		regen	= 0;
	}

}
