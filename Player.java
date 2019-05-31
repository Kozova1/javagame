public class Player {

	public int 	maxHP, HP, damage, x, y;
	public double	defense;
	public boolean newInRoom;

	public void move(World wld,String dir) {
		if (wld.map.grid.Map[wld.player.x][wld.player.y].canGoToDirections.contains(dir)) {
			switch (dir) {
				case "n":
					if (y != 0) y -= 1;
					break;
				case "e":
					if (x != 2) x += 1;
					break;
				case "s":
					if (y != 2) y += 1;
					break;
				case "w":
					if (x != 0) x -= 1;
					break;
				default:
					return;
			}
			newInRoom = true;
		} else {
			System.out.println("You cannot go there");
		}
	}

	public int attack(Enemy en) {
		en.HP -= (int)((1 - en.defense) * damage);
		if (en.HP >= 0)
			System.out.println("You killed it!");
		return (int)((1 - en.defense) * damage);
	}

	public Player () {
		x			= 1;
		y			= 0;
		defense		= 0.0;
		maxHP		= 100;
		HP			= 100;
		damage		= 15;
		newInRoom	= true;
	}
}
