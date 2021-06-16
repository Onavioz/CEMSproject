package gui;

import java.io.IOException;

import message.ServerMessage;

public interface IServerClientCommunication {

	public void sendToServer(Object msg);
	public ServerMessage getServerMsg();
}