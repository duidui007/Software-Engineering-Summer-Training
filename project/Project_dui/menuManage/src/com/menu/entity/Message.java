package com.menu.entity;

public class Message {
	private int  MessageId;
	private String MessageTopic;
	private String Message;
	private String userName;
	public Message(){}
	public int getMessageId() {
		return MessageId;
	}
	public void setMessageId(int messageId) {
		MessageId = messageId;
	}
	public String getMessageTopic() {
		return MessageTopic;
	}
	public void setMessageTopic(String messageTopic) {
		MessageTopic = messageTopic;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String messge) {
		Message = messge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
