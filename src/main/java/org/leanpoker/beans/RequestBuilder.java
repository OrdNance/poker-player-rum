package org.leanpoker.beans;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class RequestBuilder {

	public static Request buildRequest(JsonElement element) {
		Request request = new Request();
		JsonObject obj = element.getAsJsonObject();
		request.players = convertToPlayers(obj.getAsJsonArray("players"));
		request.tournamentId = obj.get("tournament_id").getAsString();
		request.gameId = obj.get("game_id").getAsString();
		request.round = obj.get("round").getAsInt();
		request.betIndex = obj.get("bet_index").getAsInt();
		request.smallBblind = obj.get("small_blind").getAsInt();
		request.orbits = obj.get("orbits").getAsInt();
		request.dealer = obj.get("dealer").getAsInt();
		request.communitCards = convertToCards(obj.getAsJsonArray("community_cards"));
		request.currentBuyIn = obj.get("current_buy_in").getAsInt();
		request.pot = obj.get("pot").getAsInt();
		return request;
	}
	
	private static List<Gambler> convertToPlayers(JsonArray playerArray) {
		List<Gambler> players = new ArrayList<>();
		for (int i = 0; i < playerArray.size(); i++) {
			Gambler gambler = new Gambler();
			gambler.name = playerArray.get(i).getAsJsonObject().get("name").getAsString();
			gambler.stack = playerArray.get(i).getAsJsonObject().get("stack").getAsInt();
			gambler.bet = playerArray.get(i).getAsJsonObject().get("bet").getAsInt();
			gambler.version = playerArray.get(i).getAsJsonObject().get("version").getAsString();
			gambler.id = playerArray.get(i).getAsJsonObject().get("id").getAsInt();
			gambler.cards = convertToCards(playerArray.get(i).getAsJsonObject().get("hole_cards").getAsJsonArray());
			players.add(gambler);
		}
		return players;
	}

	private static List<Card> convertToCards(JsonArray cardArray) {
		List<Card> cards = new ArrayList<>();
		for (int i = 0; i < cardArray.size(); i++) {
			Card card = new Card();
			card.rank = cardArray.get(i).getAsJsonObject().get("rank").getAsString();
			card.suit = cardArray.get(i).getAsJsonObject().get("suit").getAsString();
			cards.add(card);
		}
		return cards;
	}
	
}
