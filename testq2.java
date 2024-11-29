package javaprogramming;

import javaprogramming.enumtask.course;

public class testq2 {
	enum side{north,south,east,west}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		side[] presentside=side.values();
		for(side s:presentside)
		{
			switch(s)
			{
			case north:
				System.out.println("north direction");
				break;
			case south:
				System.out.println("south direction");
				break;
			case east:
				System.out.println("east direction");
				break;
			case west:
				System.out.println("west direction");
				break;
				default:
					System.out.println("enter correct direction");
					break;
				}
		}

	}

}
