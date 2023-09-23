package Domain.Entities;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class Deck {
    private UUID id;
    private UUID userId;
    private String name;
    private List<Card> cards;

    public Deck(UUID userId, String name) throws IOException {
        this.setUserId(userId);
        this.setName(name);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) throws IOException{
        if(userId.toString().equals("00000000-0000-0000-0000-000000000000")
            || userId == null)
            throw new IOException("A deck should be linked to an user.");

        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IOException{
        if(name.isBlank())
            throw new IOException("A deck must have a name.");

        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setDeck(List<Card> cards) {
        this.cards = cards;
    }
}
