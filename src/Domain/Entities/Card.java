package Domain.Entities;

import java.io.IOException;
import java.util.UUID;

public class Card {
	private UUID id;
	private UUID deckId;
	private short number;
	private String front;
	private String back;
	
	public Card(UUID deckId, short number, String front, String back) throws IOException {
		this.setDeckId(deckId);
		this.setNumber(number);
		this.setFront(front);
		this.setBack(back);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getDeckId() {
		return deckId;
	}

	public void setDeckId(UUID deckId) {
		this.deckId = deckId;
	}

	public short getNumber() {
		return number;
	}

	public void setNumber(short number) {
		this.number = number;
	}

	public String getFront() {
		return front;
	}

	public void setFront(String front) throws IOException{
		if(front.isBlank())
			throw new IOException("The front card must have a text.");

		this.front = front;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) throws IOException{
		if(back.isBlank())
			throw new IOException("The back card must have a text.");

		this.back = back;
	}
}
