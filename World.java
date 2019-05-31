public class World 
{
	Player player;
	Map map;
	Troll Troll;
	Goblin Goblin;

	public World() {
		player = new Player();
		map = new Map();
		Troll = new Troll();
		Goblin = new Goblin();					
	}

}
