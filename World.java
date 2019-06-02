public class World 
{
	Player player;
	Map map;
	Troll Troll;
	Goblin Goblin;
	Dragon Dragon;

	public World() {
		player = new Player();
		map = new Map();
		Troll = new Troll();
		Goblin = new Goblin();					
		Dragon = new Dragon();
	}

}
