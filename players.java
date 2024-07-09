package com.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="srh")
public class players {
	@Id
	@Column(name="Jersey Number")
	private int number;
	
	@Column(name="Player Age")
	private int playerAge;
	
	@Column(name="Player Name")
	private String playerName;
	
	@Column(name="Player Runs")
	private int playerRuns;

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerRuns() {
		return playerRuns;
	}

	public void setPlayerRuns(int playerRuns) {
		this.playerRuns = playerRuns;
	}

	@Override
	public String toString() {
		return "players [Jersey Number=" + number + ", playerAge=" + playerAge + ", playerName=" + playerName + ", Runs Scored By Player=" + playerRuns + "]";
	}

	
	
	
}
