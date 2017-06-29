package org.leanpoker.player;


import java.util.Map;

import org.leanpoker.beans.Gambler;
import org.leanpoker.beans.RankMapper;
import org.leanpoker.beans.Request;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "V1.03";

    public static int betRequest(JsonElement jsonElement) {
    	for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {

            System.err.println(entry.getKey() + " : " + entry.getValue());

        }
        return 100000;
    }

    private static int handleFirstHand(Request request, Gambler gambler) {
    	if (gambler.cards.size() == 2) {
    		int rank1 = RankMapper.map(gambler.cards.get(0).rank);
    		int rank2 = RankMapper.map(gambler.cards.get(1).rank);
    		String suit1 = gambler.cards.get(0).suit;
    		String suit2 = gambler.cards.get(1).suit;
    		if (rank1 == rank2 && rank1 > 6) {
    			return 100000;
    		}
    		if (suit1.equals(suit2)) {
    			return 100000;
    		}
    		if (rank1 == (rank2 + 1) || rank2 == (rank1 + 1)) {
    			return 100000;
    		}
    		if (rank1 > 10 || rank2 > 10) {
    			return 100000;
    		}
    	}
    	return 0;
	}

	private static Gambler getGambler(Request request, String name) {
    	for (Gambler gambler : request.players) {
    		if (gambler.name.equals(name)) {
    			return gambler;
    		}
    	}
		return null;
	}

	public static void showdown(JsonElement game) {
    	
    }
    
    
}
