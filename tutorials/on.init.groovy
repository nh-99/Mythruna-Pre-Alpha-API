/* Example of the 'on' Method.
 * Methods:
 * - newConnection: Called when there is a new connection on the server.
 * - playerConnected: When a player is currently logging into the server.
 * - playerDisconnected: When a player is currently disconnecting.
 * 
 * - PlayerJoin: When the player Joins. On a server, this is called after 'playerConnected'.
 * - PlayerLeft: When the player Leaves. On a server, this is called after 'playerDisconnected'.
 * 
 * - PlayerChatted: When the player has said something in the chat.
 * 
 * - serverStarted: When the server finishes loading.
 * - serverStopped: When the server finishes stopping.
 */

on([playerJoin]) {
  type, event -> //This just basically initializes it.
	
	// we are getting the player here
	// we asked for it, which 'it' is the player.
	// having no idea what their name is by default,
	// we put 'name'.
	// if we cannot find the name, their name is "Unknown".
	def playerName = it.name?:"Unknown"
	
	console.echo("Hello there, " + playerName)
}
