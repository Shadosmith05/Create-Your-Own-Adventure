public class Story {
	
	private String name;
	
	public Story(String n) {
		name = n;
	}
	
	public String scene1() {
		return "You get down to the river and see a stick looks kind of like a spear, a few rocks on the river bank "
				+ "\nthat look good for skipping, and some fish in the water that you know to be of the shad species."
				+ "\nType choice:"
				+ "\n1. to grab spear"
				+ "\n2. to skip stones"
				+ "\n3. to go to the fish"
				+ "\n4. to move on";
	}
	
	public String s1Out1() {
		return "You continue walking along the river because that wasn’t very interesting stuff."
				+ "\n" + scene2();
	}
	
	public String s1Out2() {
		return "You see that the spear is perfectly balanced as all things should be. It is in such pristine condition, a "
				+ "\\nwonderful trophy to add to your collection. The End";
	}

	public String s1Out3() {
		return "You realize that all the rocks are perfect and smooth like a baby's buttocks. You decide to pick them up "
				+ "\nand decide to skip them across the water. You had many good skips, but this one, you knew it would be the "
				+ "\none. A WORLD RECORD, 419 SKIPS!!! The End";
	}
	
	public String s1Out4() {
		return "You take one look at the shad in the water and all you see is your dinner for tonight. You unlock the beast "
				+ "\ninside and tear apart all those fish, feasting on their delicious meat and picking their bones clean. The End";
	}
	
	public String scene2() {
		return "You find a massive spirit bear playing tennis with a few of the shads from the river. As you look around, you "
				+ "\nnotice that you are surrounded by a forest full of Western White Pine trees and next to you, you see an old "
				+ "\nrickety bridge made of wood and rope that looks to be missing a couple of steps."
				+ "\nType choice:"
				+ "\n1. to play tennis"
				+ "\n2. to climb trees"
				+ "\n3. to cross the bridge"
				+ "\n4. to go home";
	}
	
	public String s2Out1() {
		return "You decide to join the game of tennis and spend countless hours with the spirit bear until you collapse in the "
				+ "\nforest from fatigue. The End";
	}
	
	public String s2Out2() {
		return "You look at the trees and see that they would be wonderful to climb, so you spend a couple hours using your "
				+ "\ninner monkey going from tree to tree and becoming one with the forest. The End";
	}
	
	public String s2Out3() {
		return "You decide to cross the bridge because you love them so much, who care about whether it’s safe or not. You get "
				+ "\nmidway through and notice all the missing steps. You then hurry to get to the other side and the rope breaks. "
				+ "\nYou hang on for dear life but feel your hands starting to slip, this is the end, you won’t survive this time. "
				+ "\nYou fall into the water and drown because you forgot how to swim. The End";
	}
	
	public String s2Out4() {
		return "You had fun on your journey but you decide that it is time to go home, so you do. The End";
	}
}
