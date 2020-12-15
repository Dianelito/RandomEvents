package com.adri1711.randomevents.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.adri1711.randomevents.RandomEvents;
import com.adri1711.randomevents.util.UtilsRandomEvents;
import com.adri1711.util.enums.XSound;

public class Move implements Listener {

	private RandomEvents plugin;

	public Move(RandomEvents plugin) {
		super();
		this.plugin = plugin;
	}

	@EventHandler
	public void onMove(PlayerMoveEvent evt) {
		Player player = evt.getPlayer();
		
		if (plugin.getMatchActive() != null && plugin.getMatchActive().getPlaying()
				&& plugin.getMatchActive().getPlayerHandler().getPlayersObj().contains(player)) {
			if (plugin.getMatchActive().getAllowMove()) {

				switch (plugin.getMatchActive().getMatch().getMinigame()) {
				case BOAT_RUN:
				case HORSE_RUN:
				case RACE:

					if (plugin.getMatchActive().getMapHandler().getCuboid().contains(player.getLocation())) {

						plugin.getMatchActive().getPlayerHandler().setPlayerContador(player);
						if (plugin.getTournamentActive() == null) {
							plugin.getMatchActive().daRecompensas(false);
						} else {
							if (!plugin.getMatchActive().getPlayerHandler().getPlayersGanadores().contains(player)) {
								plugin.getMatchActive().getPlayerHandler().getPlayersGanadores().add(player);
								for (Player p : plugin.getMatchActive().getPlayerHandler().getPlayersSpectators()) {
									p.sendMessage(plugin.getLanguage().getTagPlugin() + " "
											+ plugin.getLanguage().getRaceTournament()
													.replaceAll("%player%", player.getName())
													.replaceAll("%players%",
															"" + plugin.getMatchActive().getPlayerHandler().getPlayersGanadores().size())
													.replaceAll("%neededPlayers%",
															plugin.getMatchActive().getLimitPlayers().toString()));
								}
								plugin.getMatchActive().compruebaPartida();
							}
						}
					}
					break;
				case ESCAPE_FROM_BEAST:
					if (plugin.getMatchActive().getPlayerHandler().getBeast() != null
							&& !plugin.getMatchActive().getPlayerHandler().getBeast().getName().equals(player.getName())
							&& plugin.getMatchActive().getMapHandler().getCuboid().contains(player.getLocation())) {
						if (!plugin.getMatchActive().getPlayerHandler().getGoalPlayers().contains(player)) {
							plugin.getMatchActive().getPlayerHandler().getGoalPlayers().add(player);
							plugin.getMatchActive().ponInventarioRunner(player);
							UtilsRandomEvents.playSound(player, XSound.ENTITY_PLAYER_LEVELUP);
						}
					}
					break;
				case TNT_RUN:
					if (plugin.getMatchActive().getActivated()) {
						Location from = evt.getFrom();
						from.setY(evt.getTo().getY());

						UtilsRandomEvents.queueTNT(plugin, plugin.getMatchActive(), player.getLocation(),
								from.distance(evt.getTo()), true);
					}
					break;
				default:
					break;
				}
			} else {
				Location to = evt.getFrom();
				to.setPitch(evt.getTo().getPitch());
				to.setYaw(evt.getTo().getYaw());
				evt.setTo(to);
			}
		}

	}

	public RandomEvents getPlugin() {
		return plugin;
	}

	public void setPlugin(RandomEvents plugin) {
		this.plugin = plugin;
	}

}
