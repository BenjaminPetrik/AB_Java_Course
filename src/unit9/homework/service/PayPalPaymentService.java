package unit9.homework.service;

import unit9.homework.domain.BankAccount;
import unit9.homework.domain.Money;
import unit9.homework.exception.InvalidCurrencyException;
import unit9.homework.exception.MoneyTransferException;
import unit9.homework.exception.NotEnoughMoneyException;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void transfer(BankAccount source, BankAccount target, Money amount) throws MoneyTransferException {
        //TODO_done: Add validation here
        // 1) validate nothing is null
        // 2) validate source, target and amount has the same currency
        // 3) validate source has enough money to withdraw

        if (source != null && target != null && amount != null){
            if (amount.getCurrency() == source.getMoney().getCurrency() && amount.getCurrency()
                    == target.getMoney().getCurrency()) {
                if (source.getMoney().getAmount() >= amount.getAmount()) {
                    source.withdraw(amount);
                    target.receive(amount);
                } else {
                    throw new NotEnoughMoneyException();
                }
            } else {
                throw new InvalidCurrencyException();
            }
        } else {
            throw new MoneyTransferException("Source, target or amount is null!");
        }
    }
}
