package com.mauro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 10/10/2014
 * Time: 17:11
 * To change this template use File | Settings | File Templates.
 */
public class EnumCardDealing {

    private static class Card {
        public enum Rank { DEUCE, THREE, FOUR, FIVE, SIX,
            SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }

        public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }

        private final Rank rank;
        private final Suit suit;

        private Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        @Override
        public String toString() { return rank + " of " + suit; }

        private static final List<Card> protoDeck = new ArrayList<>();

        // Initialize prototype deck
        static {
            for (Suit suit : Suit.values())
                for (Rank rank : Rank.values())
                    protoDeck.add(new Card(rank, suit));
        }

        public static ArrayList<Card> newDeck() {
            return new ArrayList<>(protoDeck); // Return copy of prototype deck
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: EnumCardDealing hands cards");
            return;
        }
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);

        List<Card> deck = Card.newDeck();
        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }

        for (int i=0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<>(handView);
        handView.clear();
        return hand;
    }
}
