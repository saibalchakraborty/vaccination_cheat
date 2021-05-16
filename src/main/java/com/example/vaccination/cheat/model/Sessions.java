package com.example.vaccination.cheat.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Sessions {

	private List<Session> sessions;

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
}