package com.adri1711.randomevents.placeholders;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.entity.Player;

import com.adri1711.randomevents.RandomEvents;
import com.adri1711.randomevents.match.enums.MinigameType;
import com.adri1711.randomevents.match.schedule.Schedule;
import com.adri1711.randomevents.util.UtilsRandomEvents;
import com.adri1711.randomevents.util.UtilsSQL;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class ReventPlaceholder extends PlaceholderExpansion {

	private RandomEvents plugin;

	/*
	 * The identifier, shouldn't contain any _ or %
	 */
	public String getIdentifier() {
		return "randomevents";
	}

	public String getPlugin() {
		return null;
	}

	/*
	 * The author of the Placeholder This cannot be null
	 */
	public String getAuthor() {
		return "adri1711";
	}

	/*
	 * Same with #getAuthor() but for versioon This cannot be null
	 */

	public String getVersion() {
		return "1.6.7";
	}

	public ReventPlaceholder(RandomEvents plugin) {
		this.plugin = plugin;
	}

	public String onPlaceholderRequest(Player p, String identifier) {
		String res = null;
		if (plugin.isMysqlEnabled()) {

			if (identifier.equals("total_tries")) {
				Integer callback = UtilsSQL.getAllStatsSync(p, PlaceholderType.TRIES, plugin);
				if (callback != null) {
					res = callback.toString();
				}
			} else if (identifier.equals("total_wins")) {
				Integer callback = UtilsSQL.getAllStatsSync(p, PlaceholderType.WINS, plugin);
				if (callback != null) {
					res = callback.toString();
				}
			} else if (identifier.contains("tries_game_")) {
				String minigame = identifier.replace("tries_game_", "");
				MinigameType tipo = MinigameType.getByCodigo(minigame);
				if (tipo != null) {
					Integer callback = UtilsSQL.getGameStatsSync(p, PlaceholderType.TRIES, tipo, plugin);
					if (callback != null) {
						res = callback.toString();
					}
				}
			} else if (identifier.contains("wins_game_")) {
				String minigame = identifier.replace("wins_game_", "");
				MinigameType tipo = MinigameType.getByCodigo(minigame);
				if (tipo != null) {
					Integer callback = UtilsSQL.getGameStatsSync(p, PlaceholderType.WINS, tipo, plugin);
					if (callback != null) {
						res = callback.toString();
					}
				}
			} else if (identifier.equals("next_event")) {

				if (plugin.getSchedules() != null && !plugin.getSchedules().isEmpty()) {
					Map<Schedule, Date> sMap = UtilsRandomEvents.nextEvent(plugin.getSchedules(), p, plugin);
					Schedule s = null;
					Date d = null;
					for (Entry<Schedule, Date> entrada : sMap.entrySet()) {
						s = entrada.getKey();
						d = entrada.getValue();
					}
					if (s != null) {
						res = "" + (UtilsRandomEvents.calculateTime((d.getTime() - new Date().getTime()) / 1000));

					}
				} else {

					res = plugin.getLanguage().getNoScheduledEvents();

				}

			}
		}
		return res;
	}

}
