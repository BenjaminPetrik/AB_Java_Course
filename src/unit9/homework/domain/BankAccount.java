package unit9.homework.domain;

public class BankAccount {
    private Money money;
    private final String iban;
    private final Card owner;

    // TODO_done: add null checks for params
    // TODO_done: Optional: check that iban contain exactly 15 symbols and throw unchecked exception otherwise
    public BankAccount(Money money, String iban, Card card) {
        if (money != null && iban != null && card != null) {
            this.money = money;
            this.owner = card;
            if (iban.length() == 15) {
                this.iban = iban;
            } else {
                throw new IllegalArgumentException("IBAN should equal exactly 15 chars");
            }
        } else {
            throw new NullPointerException("Money, IBAN and card should not be null!");
        }



    }

    public String getIban() {
        return iban;
    }

    public Card getOwner() {
        return owner;
    }

    public Money getMoney() {
        return money;
    }

    public void withdraw(Money withdraw) {
        long newMoneyAmount = money.getAmount() - withdraw.getAmount();
        money = new Money(newMoneyAmount, money.getCurrency());
    }

    public void receive(Money withdraw) {
        long newMoneyAmount = money.getAmount() + withdraw.getAmount();
        money = new Money(newMoneyAmount, money.getCurrency());
    }
}
