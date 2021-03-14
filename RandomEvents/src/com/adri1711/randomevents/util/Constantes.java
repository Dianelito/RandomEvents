package com.adri1711.randomevents.util;

public class Constantes {

	public static String ALL = "ALLMINIGAMES";

	public static String DONE = "Done";
	public static String ADD = "Add";
	public static String NEXT = "Next";
	public static String SAME = "Same";
	public static String NEW = "New";
	public static String CADENA_PLAYER = "%player%";
	public static String SALTO_LINEA = "\n";
	public static String TABULACION = "    ";

	public static String PERM_COOLDOWN = "randomevent.gui.cooldown";
	public static String PERM_COOLDOWN_BYPASS = "randomevent.gui.cooldown.bypass";

	public static String INVENTORY_NAME = "§9RandomEvents";
	public static String INVENTORY_NAME_STATS = "§9RandomEvents Stats";
	public static String INVENTORY_INFO_WAVE = "§9RandomEvents Wave Info";
	public static String INVENTORY_NAME_STATS_WITHOUT = "§9Stats";
	public static String WAITING = "§2Waiting";
	public static String PLAYING = "§cPlaying";
	public static String PROBABILITY_CMD = "reprob";
	public static String MATCH_PLAYED = "§6§lNumber of tries";
	public static String MATCH_WIN = "§6§lNumber of wins";
	public static String TOP_1 = "§6§lTop 1";
	public static String TOP_2 = "§6§lTop 2";
	public static String TOP_3 = "§6§lTop 3";
	public static String COOLDOWN_OUT = "§6You can play again:";
	public static String PERMISO_TOP = "bossbattle.see.top";
	public static String CHOOSE_MOB = "§6§lChoose Mob";
	public static String SPAWN_MOB = "§6§lSpawn Mob";
	public static String SEE_INFO_WAVE = "§6§lSee Info Wave";
	public static String NEXT_WAVE = "§2§lNext Wave";
	public static String END_CREATION = "§c§lEnd RandomEvent";
	public static String CONTENTS = "contents";
	public static String EQUIPMENT = "equipment";
	public static String GREEN = "§2§l";
	public static String SPLEGG_EGG = "Splegg Egg Code 001";

	public enum Messages {

		CMD_HELP_MENU("helpMenu", "menu.helpMenu", "&6----------------- &e&lRandomEvents &6---------------------"),

		CMD_SHOW_MENU("showMenu", "menu.showMenu", "   &6/revent:\n          &e-> Shows this menu"),

		CMD_JOIN("join", "menu.join", "   &6/revent join:\n          &e-> Join the Random Event"),

		CMD_SPEC("spec", "menu.spec", "   &6/revent spec:\n          &e-> Spectate the Random Event"),

		CMD_JOIN_TOURNAMENT("tjoin", "menu.tjoin",
				"   &6/revent tjoin:\n          &e-> Join the Tournament Random Event"),

		CMD_LEAVE("leave", "menu.leave", "   &6/revent leave:\n          &e-> Leave the Random Event"),

		CMD_LEAVE_TOURNAMENT("tleave", "menu.tleave",
				"   &6/revent tleave:\n          &e-> Leave the Tournament Random Event"),

		CMD_STATS("stats", "menu.stats", "   &6/revent stats:\n          &e-> Show the stats"),

		CMD_STATS_OTHER("statsOther", "menu.statsOther",
				"   &6/revent stats <player>:\n          &e-> Show the stats of a player"),

		CMD_FORCESTOP("forcestop", "menu.admin.forcestop",
				"   &6/revent forcestop:\n          &e-> Force the stop of the Random Event"),

		CMD_SPAWNSET("spawnset", "menu.admin.spawnset",
				"   &6/revent spawnset:\n          &e-> Set the spawn, where players will be teleported after finishing a Random Event"),

		CMD_SPAWNSET_TOURNAMENT("tspawnset", "menu.admin.tspawnset",
				"   &6/revent tspawnset:\n          &e-> Set the spawn where players will be teleported after joining a Tournament Random Event"),

		CMD_MATCHES("menuMatches", "menu.admin.matches",
				"   &6/revent matches:\n          &e-> Show all Random Events available"),

		CMD_CHECKPOINT("checkpoint", "menu.checkpoint",
				"   &6/revent checkpoint:\n          &e-> Makes the user go back to the checkpoint"),

		CMD_NEXT("next", "menu.next", "   &6/revent next:\n          &e-> Show next scheduled Random Events"),

		CMD_CURRENT_DATE("date", "menu.admin.currentdate",
				"   &6/revent date:\n          &e-> Shows the current date for the schedule"),

		CMD_SCHEDULE("schedule", "menu.admin.schedule",
				"   &6/revent schedule <monday:tuesday...> <hour> <minute>:\n          &e-> Create a schedule for a Random Event"),

		CMD_SCHEDULE_SPECIFIC("scheduleSpecific", "menu.admin.scheduleSpecific",
				"   &6/revent schedule <monday:tuesday...> <hour> <minute> <idmatch>:\n          &e-> Create a schedule for a Random Event and specific match"),

		CMD_FORCE_BEGIN("forcebegin", "menu.admin.forcebegin",
				"   &6/revent forcebegin:\n          &e-> Force to begin the match"),

		CMD_BEGIN("begin", "menu.admin.force", "   &6/revent begin:\n          &e-> Begins a Random Event"),

		CMD_BEGIN_TOURNAMENT("tbegin", "menu.admin.tforce",
				"   &6/revent tbegin:\n          &e-> Begins a Tournament Random Event"),

		CMD_BEGIN_SPECIFIC("beginSpecific", "menu.admin.forceSpecific",
				"   &6/revent begin <number>:\n          &e-> Begins a specific random event"),

		CMD_GUI("guiCMD", "menu.guicmd", "   &6/revent gui:\n          &e-> Shows the available events gui"),

		CMD_GIVE_CREDITS_RANDOM("giveCreditsRandom", "menu.admin.givecreditsrandom",
				"   &6/revent givecredits <player> <amount>:\n          &e-> Give credits of a random chosen event to a player"),

		CMD_GIVE_CREDITS_SPECIFIC("giveCreditsSpecific", "menu.admin.givecreditsspecific",
				"   &6/revent givecredits <reventname> <player> <amount>:\n          &e-> Give credits of the specific event to a player"),

		CMD_BAL_CREDITS("creditsBalOwn", "menu.admin.balcreditsown",
				"   &6/revent credits:\n          &e-> Shows your credits"),

		CMD_BAL_CREDITS_OTHER("creditsBalOther", "menu.admin.balcreditsother",
				"   &6/revent credits <player>:\n          &e-> Shows the player credits"),

		CMD_BAN_PLAYER("ban", "menu.admin.ban",
				"   &6/revent ban <player> <time>:\n          &e-> Ban a player from RandomEvents"),

		CMD_UNBAN_PLAYER("unban", "menu.admin.unban",
				"   &6/revent unban <player>:\n          &e-> Unban a player from RandomEvents"),

		CMD_CREATE("create", "menu.admin.create",
				"   &6/revent create:\n          &e-> Begin the creation of a Random Event"),

		CMD_DELETE("delete", "menu.admin.delete",
				"   &6/revent delete <number>:\n          &e-> Delete a Random Event"),

		CMD_DISABLE("disable", "menu.admin.disable",
				"   &6/revent disable <number>:\n          &e-> Disables a Random Event"),

		CMD_ENABLE("enable", "menu.admin.enable",
				"   &6/revent enable <number>:\n          &e-> Enables a Random Event"),

		CMD_EDIT("edit", "menu.admin.edit", "   &6/revent edit <number>:\n          &e-> Edits a Random Event"),

		CMD_CANCEL("cancel", "menu.admin.cancel",
				"   &6/revent cancel:\n          &e-> Cancels the creation of a Random Event"),

		CMD_RELOAD("reload", "menu.admin.reload", "   &6/revent reload:\n          &e-> Reload the plugin"),

		TAG_PLUGIN("tagPlugin", "tagPlugin", "&a&lRandomEvents &f&l>>"),

		INVALID_INPUT("invalidInput", "creation.invalidInput", "&c&lInvalid input, try another one"),

		STARTING_MATCH("startingMatch", "comun.startingMatch", "&6&lMatch starting in %time% seconds"),

		IDLE_DAMAGE("idleDamage", "comun.idleDamage", "&c&lTaking damage for afk..."),

		YOU_ARE_BANNED("youAreBanned", "comun.youAreBanned", "&c&lYou are banned from RandomEvents until %time%"),

		BAN_PLAYER("banPlayer", "comun.banPlayer", "&c&lPlayer banned until %time%"),

		UNBAN_PLAYER("unbanPlayer", "comun.unbanPlayer", "&c&lPlayer unbanned from RandomEvents"),

		PLAYER_NOT_BANNED("playerNotBanned", "comun.playerNotBanned", "&c&lPlayer is not banned from RandomEvents"),

		NO_SCHEDULED_EVENTS("noScheduledEvents", "comun.noScheduledEvents", "&c&lThere are not RandomEvents scheduled"),

		NEXT_EVENT("nextEvent", "comun.nextEvent", "&c&lNext RandomEvent:"),

		NEXT_EVENT_RANDOM("nextEventIsRandom", "comun.nextEventIsRandom", "&6&lRandomEvent"),

		NEXT_EVENT_NAME("nextEventName", "comun.nextEventName", "&6&lEvent: "),

		CANCEL_MINE_CREATION("cancelOfMatchCreation", "creation.cancelOfMatchCreation", "&c&lEvent creation canceled "),

		LACKS_INFO_CREATION("lacksInfoCreation", "creation.lacksInfoCreation",
				"&c&lEvent cant be created, it lacks information, check the fields again "),

		SHRINK("shrink", "comun.shrink", "&c&lMap border shrinking in %time% seconds"),

		WARMUP_END("warmupEnd", "comun.warmupEnd", "&c&lWarmup end in %time% seconds"),

		PLAYERS_MOVE("playersMove", "comun.playersMove", "&c&lPlayers will be able to move in %time% seconds"),

		SECONDS_3_REMAINING("secondsRemaining3", "comun.secondsRemaining3", "&6&l3"),

		SECONDS_2_REMAINING("secondsRemaining2", "comun.secondsRemaining2", "&6&l2"),

		SECONDS_1_REMAINING("secondsRemaining1", "comun.secondsRemaining1", "&6&l1"),

		ERROR("error", "comun.error", "&c&lSome error ocurred, check the server log."),

		CMD_NOT_ALLOWED("cmdNotAllowed", "comun.cmdNotAllowed", "&c&lYou cant use this command here"),

		INVALID_CMD("invalidCmd", "comun.invalidCmd",
				"&c&lInvalid command, do /randomevent or /revent to see the valid commands"),

		NO_PERMISSION("noPermission", "comun.noPermission", "&c&lYou don't have permission to do that!"),

		END_OF_ARENA_CREATION("endOfArenaCreation", "creation.endOfArenaCreation",
				"&6&lYou successfully created a RandomEvents!"),

		END_OF_SCHEDULE_CREATION("endOfScheduleCreation", "creation.endOfScheduleCreation",
				"&6&lYou successfully created a Schedule!"),

		CANCEL_OF_ARENA_CREATION("cancelOfArenaCreation", "creation.cancelOfArenaCreation",
				"&6&lYou canceled the creation of a RandomEvents!"),

		PLUGIN_RELOAD("pluginReload", "comun.pluginReload", "&6&lPlugin reloaded!"),

		MATCH_FULL("matchFull", "match.matchFull", "&c&lThe match is already full"),

		ALREADY_PLAYING_MATCH("alreadyPlayingMatch", "match.alreadyPlayingMatch",
				"&c&lYou can't leave the match if it has begun"),

		MATCH_BEGUN("matchBegun", "match.matchBegun", "&c&lThe event has begun, you cant join now"),

		MATCHES("matches", "match.matches", "&6&lMatches:"),

		ALREADY_MATCH("alreadyMatch", "match.alreadyMatch",
				"&c&lYou can't create another event while one is still running"),

		WAITING_FOR_PLAYERS("waitingForPlayers", "match.waitingForPlayers",
				"&6&lWaiting for players. ( %players% / %neededPlayers% )"),

		SPAWN_SET("spawnSet", "comun.spawnSet", "&6&lYou have set the spawn succesfully"),

		NOT_IN_MATCH("notInMatch", "match.notInMatch", "&c&lYou are not in an event"),

		WIN_RANDOM_EVENTS("winRandomEvents", "match.winRandomEvents", "&6&lCongratulations! You won the event"),

		EVENT_ANNOUNCE("eventAnnounce", "announce.eventAnnounce",
				"&6&lThe event &e&l'%event%'&6&l of type  &e&l'%type%'&6&l, begins in: "),

		EVENT_STOPPED("eventStopped", "announce.eventStopped",
				"&6&lThe event &e&l'%event%'&6&l of type  &e&l'%type%'&6&l, was forced to stop."),

		EVENT_CANCELLED("eventCancelled", "announce.eventCancelled",
				"&6&lThe event &e&l'%event%'&6&l of type  &e&l'%type%'&6&l, was cancelled for lack of players."),

		TOURNAMENT_CANCELLED("tournamentCancelled", "announce.tournamentCancelled",
				"&6&lThe tournament was cancelled for lacking players."),

		INVALID_PASSWORD("invalidPassword", "comun.invalidPassword", "&c&lInvalid password for the event"),

		ANNOUNCEMENT_FIRST("announceFirst", "announce.announceFirst",
				"\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█  &5&lRandom Event\n&f█&8█&f██&8███&f█  &c%type%\n&f█&8█&f████&8█&f█  &8[ &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█  %clickhere% \n&f█&8██████&f█\n&f████████"),

		ANNOUNCEMENT_NEXT("announceNext", "announce.announceNext",
				"&6&lRandom Event &e&l>> &c%type% %clickhere% &8[ &a%players%/%neededPlayers% &8] "),

		ANNOUNCEMENT_FIRST_TOURNAMENT("announceFirstTournament", "announce.announceFirstTournament",
				"\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█  &5&lTournament Random Event\n&f█&8█&f██&8███&f█  \n&f█&8█&f████&8█&f█  &8[ &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█  %clickhere% \n&f█&8██████&f█\n&f████████"),

		ANNOUNCEMENT_NEXT_TOURNAMENT("announceNextTournament", "announce.announceNextTournament",
				"&6&lTournament Random Event &e&l>>  %clickhere% &8[ &a%players%/%neededPlayers% &8] "),

		CLICK_HERE("clickHere", "announce.clickHere", "&b[Click here to join]"),

		// FIRST_ANNOUNCE("firstAnnounce", "announce.firstAnnounce",
		// "\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█ &5&lRandom
		// Event\n&f█&8█&f██&8███&f█ &c%type%\n&f█&8█&f████&8█&f█ &8[
		// &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█ "),
		//
		// NEXT_ANNOUNCE("nextAnnounce", "announce.nextAnnounce",
		// "\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█ &5&lRandom
		// Event\n&f█&8█&f██&8███&f█ &c%type%\n&f█&8█&f████&8█&f█ &8[
		// &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█ "),
		//
		// FIRST_ANNOUNCE_TOURNAMENT("firstAnnounceTournament",
		// "announce.firstAnnounceTournament",
		// "\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█ &5&lTournament Random
		// Event\n&f█&8█&f██&8███&f█ &c%type%\n&f█&8█&f████&8█&f█ &8[
		// &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█ "),
		//
		// NEXT_ANNOUNCE_TOURNAMENT("nextAnnounceTournament",
		// "announce.nextAnnounceTournament",
		// "\n&f████████\n&f█&8██████&f█\n&f█&8█&f█████&f█ &5&lTournament Random
		// Event\n&f█&8█&f██&8███&f█ &c%type%\n&f█&8█&f████&8█&f█ &8[
		// &a%players%/%neededPlayers% &8] \n&f█&8█&f████&8█&f█ "),
		//
		//
		// LAST_PART("lastPart", "announce.lastPart",
		// "\n&f█&8██████&f█\n&f████████"),
		//
		// LAST_PART_TOURNAMENT("lastPartTournament",
		// "announce.lastPartTournament",
		// "\n&f█&8██████&f█\n&f████████"),

		RACE_TOURNAMENT("raceTournament", "announce.raceTournament",
				"&6&lThe player %player% has reached the goal ( %players% / %neededPlayers% )"),

		YOU_BEAST("youBeast", "announce.youBeast", "&6&lYou are the beast, wait until you get teleported to the arena"),

		TOURNAMENT_ALIVE("tournamentAlive", "match.tournamentAlive",
				"&e&lThese players still survive on the tournament :"),

		WINNERS("winners", "match.winners",
				"&e&l%players% &6&lwon the Random Event &e&l'%event%'&6&l ! Congratulations!"),

		WINNERS_TOURNAMENT("winnersTournament", "match.winnersTournament",
				"&e&l%players% &6&lwon the Tournament Random Event ! Congratulations!"),

		WINNERS_POINTS("winnersPoints", "match.winnersPoints",
				"&e&l%players% &6&lwon the Random Event '%event%' with %points% points ! Congratulations!"),

		DISPOSE_LEATHER_ITEMS("disposeLeatherItems", "comun.disposeLeatherItems",
				"&c&lFor security reasons please leave your leather items before entering the event"),

		CLEAR_INVENTORY("clearInventory", "comun.clearInventory",
				"&c&lClear the inventory before joining the RandomEvent"),

		SHOW_ALONE("showAlone", "match.showAlone", "&6&lYou are playing alone, good luck!"),

		SHOW_TEAM("showTeam", "match.showTeam", "&6&lYour team is: &e&l%players%"),

		TIME_REMAINING("timeRemaining", "match.timeRemaining", "&6&l%minutes% remaining"),

		NOW_POINTS("nowPoints", "match.nowPoints", "&6&lYou have now &e&l%points% &6&lpoints"),

		NOW_GEMS("nowGems", "match.nowGems", "&6&lThe player &e&l%player% &6&lhas now &e&l%points% &6&lgems"),

		NOW_PROTECTED("nowProtected", "match.nowProtected", "&6&lYou are now protected for 3 seconds"),

		MATCH_BEGIN_SOON("matchBeginSoon", "match.matchBeginSoon", "&6&lThe Random Event will begin soon"),

		LOST_GEMS("lostGems", "match.lostGems", "&e&l%player% &6&llost all gems"),

		PLAYER_WINNING("playerWinning", "match.playerWinning",
				"&6&lThe player &e&l%player% &6&lhas enough gems, kill him or the match will end"),

		PLAYER_WINNING_SECONDS("playerWinningSeconds", "match.playerWinningSeconds",
				"&e&l%player% &6&lwins in %seconds% seconds"),

		BOMB_SECONDS("bombSeconds", "match.bombSeconds", "&6&lBomb explodes in %seconds% seconds"),

		PLAYER_HAS_BOMB("playerHasBomb", "match.playerHasBomb", "&6&lThe player &e&l%player% &6&lhas the bomb"),

		BOMB_EXPLODE("bombExplode", "match.bombExplode", "&6&lThe player &e&l%player% &6&lblew up"),

		LEAVE_COMMAND("leaveCommand", "comun.leaveCommand",
				"&6&lYou are now a spectator. Use &e&l/revent leave &6&lto leave spectator mode"),

		ERROR_SAVING_INVENTORY("errorSavingInventory", "comun.errorSavingInventory",
				"&c&lYour inventory failed on save, please save your items and try again"),

		STATS_DISABLED("statsDisabled", "stats.statsDisabled", "&c&lThe stats are disabled"),

		STATS_TRIES("statsTries", "stats.statsTries", "&cTries: "),

		STATS_WINS("statsWins", "stats.statsWins", "&2Wins: "),

		STATS_WIN_RATIO("statsWinsRatio", "stats.statsWinsRatio", "&eWin Ratio: "),

		PVP_DEATH("pvpDeath", "pvp.death", "&c☠ %victim%"),

		PVP_KILL("pvpKill", "pvp.kill", "&a%killer% &4⚔ &c%victim%"),

		BOW_KILL("bowKill", "pvp.bowkill", "&a%killer% &4⚔ &c%victim%  &e( %distance% blocks )"),

		SCOREBOARD_TITLE("scoreboardTitle", "scoreboard.title", "      &a&lRandomEvents      "),

		SCOREBOARD_POINTS_FORMAT("scoreboardPoints", "scoreboard.points", "&6%name% - &e%points%"),

		SCOREBOARD_STEP_FORMAT("scoreboardStep", "scoreboard.step", "&6%name% - &e(%actual%/%max%)"),

		SCOREBOARD_ALIVE_FORMAT("scoreboardAlive", "scoreboard.alive", "&a✔ %name%"),

		SCOREBOARD_DEATH_FORMAT("scoreboardDeath", "scoreboard.dead", "&c☠ %name%"),

		SCOREBOARD_TEAM_ALIVE_FORMAT("scoreboardTeamAlive", "scoreboard.team.alive", "&a✔ %team_color%%name%"),

		SCOREBOARD_TEAM_DEATH_FORMAT("scoreboardTeamDeath", "scoreboard.team.dead", "&c☠ %team_color%%name%"),

		SCOREBOARD_TEAM_FORMAT("scoreboardTeam", "scoreboard.teamformat", "&6Team: %team_color%%name%"),

		SCOREBOARD_COMPANION_FORMAT("scoreboardTeammate", "scoreboard.teammate", "&6Mate: &e%name%"),

		SCOREBOARD_BEAST_FORMAT("scoreboardBeast", "scoreboard.beast", "&6Beast: &e%name%"),

		SCOREBOARD_HOLDER_FORMAT("scoreboardHolder", "scoreboard.holder", "&6Holder: &e%name%"),

		SCOREBOARD_TIME_FORMAT("scoreboardTime", "scoreboard.time", "&b%time%"),

		STATS_GUI_NAME("statsGuiName", "stats.guiname", "&bRandomEvents_Stats "),

		CREDITS_GUI_NAME("creditsGuiName", "credits.guiname", "&bRandomEvents_Available"),

		CREDITS_GUI_PAGE("creditsGuiPage", "credits.guipage", "&6Page"),

		CREDITS_ADDED_OTHER("creditsAddedOther", "credits.addedother",
				"&6&l%credits% credits for %event% added to %player% "),

		CREDITS_ADDED("creditsAdded", "credits.addedown", "&6&l%credits% credits for %event% added to your account"),

		CREDITS_BAL("creditsBal", "credits.balance", "&6&l%credits% credits"),

		CREDITS_COOLDOWN("creditsCooldown", "credits.cooldown", "&b&lOn cooldown"),

		CREDITS_EVENT_RUNNING("creditsEventRunning", "credits.eventrunning", "&c&lEvent running!"),

		CREDITS_READY("creditsReady", "credits.ready", "&a&lReady"),

		EVENT_DELETED("eventDeleted", "comun.eventDeleted", "&c&lThe RandomEvents was deleted!"),

		EVENT_DISABLED("eventDisabled", "comun.eventDisabled", "&c&lThe RandomEvents was disabled!"),

		EVENT_ENABLED("eventEnabled", "comun.eventEnabled", "&6&lThe RandomEvents was enabled!"),

		EVENT_IS_DISABLED("eventIsDisabled", "comun.eventIsDisabled", "&c&lThe RandomEvents is disabled!"),

		PLAYER_OFFLINE("playerOffline", "comun.playerOffline", "&c&lThe player is offline!"),

		EVENT_INVALID("eventInvalid", "comun.eventInvalid", "&c&lThe RandomEvents is invalid!"),

		ITEM_RETURN_CHECKPOINT("itemReturnCheckpoint", "item.returnCheckpoint", "&2&lReturn to checkpoint"),

		ITEM_HIDE_PLAYER("itemHidePlayer", "item.hidePlayer", "&c&lHide players"),

		ITEM_SHOW_PLAYER("itemShowPlayer", "item.showPlayer", "&2&lShow players"),

		KIT_GUI_NAME("kitGuiName", "kit.guiName", "&6&lKits"),

		KIT_CHOSEN("kitChosen", "kit.chosen", "&6&lYou chosed %kit_name%"),

		KIT_ITEM_NAME("kitItemName", "kit.itemName", "&6&lKits"),

		KIT_DEFAULT_NAME("kitDefaultName", "kit.defaultName", "&6&lKit: %kit_name%"),

		KIT_DEFAULT_LORE("kitDefaultLore", "kit.defaultLore", "&eChoose it!;&eWin with this one!."),

		MINIGAME_DESC_BR("minigameDescriptionBR", "minigame.description.BR",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_BRT2("minigameDescriptionBRT2", "minigame.description.BRT2",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_LJ("minigameDescriptionLJ", "minigame.description.LJ",
				"&eA fierce battle where just 1 player;&e with his horse can remain alive."),

		MINIGAME_DESC_TKLL("minigameDescriptionTKLL", "minigame.description.TKLL",
				"&eOnly the most powerful assasin can win this event, kill players to get points,;&e the player with more points will get the rewards"),

		MINIGAME_DESC_TKLLT2("minigameDescriptionTKLLT2", "minigame.description.TKLLT2",
				"&eOnly the most powerful assasin can win this event, kill players to get points,;&e the team with more points will get the rewards"),

		MINIGAME_DESC_KBD("minigameDescriptionKBD", "minigame.description.KBD",
				"&eA battle where your attack power does not matter, you will have to make an strategy;&e to get the enemies thrown away from the arena to get them killed!;&e Be the last one who stands!"),

		MINIGAME_DESC_EARR("minigameDescriptionEARR", "minigame.description.EARR",
				"&eAvoid the arrows coming from the sky if you;&e dont want to lose your head!"),

		MINIGAME_DESC_GEMC("minigameDescriptionGEMC", "minigame.description.GEMC",
				"&eRandom gems will spawn in the arena. Try to get all of them until you reach 10 gems;&e or steal it from the enemies that has them. Stand 10 seconds;&e more carrying your 10 gems and you will get your hands on the reward!"),

		MINIGAME_DESC_BOMB("minigameDescriptionBOMB", "minigame.description.BOMB",
				"&eRun with the bomb and hit enemies to give it to them and avoid your own death.; &e From time to time the bomb will explode and will get the player that had it;&e and everyone near him dead."),

		MINIGAME_DESC_BOAT_RUN("minigameDescriptionBOAT_RUN", "minigame.description.BOAT_RUN",
				"&eBe the fastest sailor and reach the finish line before;&e your pursuers!"),

		MINIGAME_DESC_HORSE_RUN("minigameDescriptionHORSE_RUN", "minigame.description.HORSE_RUN",
				"&eBe the fastest horse rider and reach the finish line before;&e your pursuers!"),

		MINIGAME_DESC_ESCAPE_FROM_BEAST("minigameDescriptionESCAPE_FROM_BEAST",
				"minigame.description.ESCAPE_FROM_BEAST",
				"&eThe classic Run from the beast minigame!;&e Beat the beast by completing all the scenario and get enough equipment;&e to make damage to the beast!"),

		MINIGAME_DESC_RACE("minigameDescriptionRACE", "minigame.description.RACE",
				"&eRun and be the first to reach the goal;&e to get your reward!"),

		MINIGAME_DESC_WDROP("minigameDescriptionWDROP", "minigame.description.WDROP",
				"&eRun and drop safe!;&e be the first to reach the last goal;&e to get your reward!"),

		MINIGAME_DESC_TNTRUN("minigameDescriptionTNTRUN", "minigame.description.TNTRUN",
				"&eRun for your life, the tnt behind you will disappear,;&e try to stay over them to win the match!"),

		MINIGAME_DESC_SPLEEF("minigameDescriptionSPLEEF", "minigame.description.SPLEEF",
				"&eMake the other players fall by breaking the blocks on their feets,;&e be the one to stay safe to win the reward!"),

		MINIGAME_DESC_SPLEGG("minigameDescriptionSPLEGG", "minigame.description.SPLEGG",
				"&eAnother type of Spleef but this time use your pistol to throw eggs;&e that will break the floor!"),

		MINIGAME_DESC_OITC("minigameDescriptionOITC", "minigame.description.OITC",
				"&eGame that arrows are letal, hit your enemies to get points;&e and if you get out of arrows... Good luck!"),

		MINIGAME_DESC_SG("minigameDescriptionSG", "minigame.description.SG",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_TSG("minigameDescriptionTSG", "minigame.description.TSG",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_SW("minigameDescriptionSW", "minigame.description.SW",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_TSW("minigameDescriptionTSW", "minigame.description.TSW",
				"&eA fierce battle where just 1 player;&e or team can remain alive."),

		MINIGAME_DESC_ANVIL_SPLEEF("minigameDescriptionANVIL_SPLEEF", "minigame.description.ANVIL_SPLEEF",
				"&eAvoid the anvils coming from the sky if you;&e dont want to lose your head!"),

		MINIGAME_DESC_QUAKE("minigameDescriptionQUAKE", "minigame.description.QUAKE",
				"&eLeft Click to jump, Right click to shoot!;&eShoot your enemies!;&e Get all of them dead!"),

		MINIGAME_DESC_PBALL("minigameDescriptionPBALL", "minigame.description.PBALL",
				"&eShoot your enemies with the snowballs!;&e Get all of them dead!");

		private String javaField;
		private String ymlField;
		private String messageDefault;

		private Messages(String javaField, String ymlField, String message) {
			this.javaField = javaField;
			this.ymlField = ymlField;
			this.messageDefault = message;
		}

		public String getJavaField() {
			return javaField;
		}

		public void setJavaField(String javaField) {
			this.javaField = javaField;
		}

		public String getYmlField() {
			return ymlField;
		}

		public void setYmlField(String ymlField) {
			this.ymlField = ymlField;
		}

		public String getMessageDefault() {
			return messageDefault;
		}

		public void setMessageDefault(String messageDefault) {
			this.messageDefault = messageDefault;
		}

	}

}
