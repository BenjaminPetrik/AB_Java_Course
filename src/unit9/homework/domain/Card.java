package unit9.homework.domain;

public class Card {
    private final String fullName;
    private final String cardNumber;

    public Card(String fullName, String cardNumber) {
        // TODO_done: 1) Add validation that fullName is not null
        // TODO_done: 2) Add validation that cardNumber is non-null
        // throw NullPointerException if validation fails
        // TODO_done: Optional: Validate that cardNumber contain exactly 16 digits.
        //  And throw some unchecked exception if it invalid
        if (fullName != null) {
            this.fullName = fullName;
        } else {
            throw new NullPointerException("FullName should not be null!");
        }

        if (cardNumber == null) {
            throw new NullPointerException("Card number should not be null!");
        }

        if (cardNumber.length() != 16){
            throw new IllegalArgumentException("Card number should equal exactly 16 chars!");
        } else {
            this.cardNumber = cardNumber;
        }

    }

    public String getFullName() {
        return fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
