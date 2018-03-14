

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	private ArrayList<Card> cards = new ArrayList<Card>(); 
	
	public int getRemaining(Object eNum)
	{
		int count = 0;
		if(eNum instanceof eRank)
		{
			for(Card c : cards)
			{
				if(c.getERank() == eNum)
					count++;
			}
		}
		else
		{
			for(Card c : cards)
			{
				if(c.getESuit() == eNum)
					count++;
			}
		}
		return count;		
	}
	
	public Card draw() throws Exception 
	{
		if(cards.size()==0)
		{
			throw new Exception("Deck is empty");
		}
		return cards.remove(0);
	}
}