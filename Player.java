public class Player {

	public int 	maxHP, HP, damage, x, y;
	public double	defense;
	public boolean newInRoom;

	public void move(World wld,int dir) {
		if ((wld.map.grid.Map[x][y].canGoToDirections & dir) != 0) {
			switch (dir) {
				case 0b00001000:
					y += 1;
					break;
				case 0b00000100:
					x += 1;
					break;
				case 0b00000010:
					y -= 1;
					break;
				case 0b00000001:
					x -= 1;
					break;
				default:
					return;

			}
		} else {
			System.out.println("You cannot go there");
		}
	}

	public void attack(Enemy en) {
		en.HP -= (1 - en.defense) * damage;
		if (en.HP <= 0) {
			en = null;
		}
	}

	public Player () {
		x			= 0;
		y			= 1;
		defense		= 0.0;
		maxHP		= 100;
		HP			= 100;
		damage		= 15;
		newInRoom	= true;
	}

}
