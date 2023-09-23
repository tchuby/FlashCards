package Data.Repositories;

import Domain.Entities.Card;
import Domain.Entities.Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeckRepository {
    private List<Deck> deckCollection;

    public DeckRepository(){
        deckCollection = new ArrayList<>();
    };

    public void addDeck(Deck deck){
        deckCollection.add(deck);
    }

    public void removeDeck(Deck deck){
        deckCollection.remove(deck);
    }

    public void addCard(UUID userId, String deckName, Card card) throws Exception {
       var deck = getDeckByNameAndUserId(userId, deckName);
       if(deck != null){
           deck.getCards().add(card);
       }
       else{
           throw new Exception("There is no deck witn name: " + deckName + ".");
       }
    }

    public Deck getDeckByNameAndUserId(UUID userId, String deckName){
        for(Deck deck : deckCollection){
            if(deck.getUserId().equals(userId) &&
                    deck.getName().equals(deckName)){
                return deck;
            }
        }
        return null;
    }
}
