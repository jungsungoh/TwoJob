package com.blocker.service;

import java.util.List;

import com.blocker.dto.ChatMessage;
import com.blocker.dto.Chatroom;

public interface ChatService {
	public Object makeChatRoom(String from, String to);
	public List<Chatroom> allroom();
	public Chatroom getRoom(Long id);
	public void saveMessage(ChatMessage msg);
	public Object getMyChat(String accessToken);
}
