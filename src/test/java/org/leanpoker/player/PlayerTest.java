package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;
import org.leanpoker.beans.Request;
import org.leanpoker.beans.RequestBuilder;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

public class PlayerTest {

	public String JSON = "{\"players\":[{\"name\":\"Rum\",\"stack\":1000, \"status\":\"active\"," +
	      "\"bet\":0," +
	      "\"hole_cards\":[{\"rank\": \"5\", \"suit\":\"dimonds\"}, {\"rank\": \"5\", \"suit\":\"dimonds\"}]," +
	      "\"version\":\"Version name 1\"," + 
	      "\"id\":0" +
	    "}," +
	    "{" +
	      "\"name\":\"Player 2\"," +
	      "\"stack\":1000," +
	      "\"status\":\"active\"," +
	      "\"bet\":0," +
	      "\"hole_cards\":[]," +
	      "\"version\":\"Version name 2\"," +
	      "\"id\":1" + 
	    "}" +
	  "]," +
	  "\"tournament_id\":\"550d1d68cd7bd10003000003\"," +
	  "\"game_id\":\"550da1cb2d909006e90004b1\"," +
	  "\"round\":0," +
	  "\"bet_index\":0," +
	  "\"small_blind\":10," +
	  "\"orbits\":0," +
	  "\"dealer\":0," +
	  "\"community_cards\":[]," +
	  "\"current_buy_in\":0," +
	  "\"pot\":0" +
	"}";
	
	@Ignore
    @Test
    public void testBetRequest() throws Exception {
        JsonElement jsonElement = new JsonParser().parse(JSON);
        assertEquals(0, Player.betRequest(jsonElement));

    }
    
    
}
