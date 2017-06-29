package org.leanpoker.beans;

import java.util.List;

public class Request {

	public List<Gambler> players;
	
	public String tournamentId;
	
	public String gameId;
	
	public Integer round;
	
	public Integer betIndex;
	
	public Integer smallBblind;
	
	public Integer orbits;
	
	public Integer dealer;
	
	public List<Card> communitCards;
	
	public Integer currentBuyIn;
	
	public Integer pot;
	
}
