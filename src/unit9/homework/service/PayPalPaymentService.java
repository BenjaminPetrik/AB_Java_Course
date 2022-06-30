package unit9.homework.service;

import unit9.homework.domain.BankAccount;
import unit9.homework.domain.Money;
import unit9.homework.exception.MoneyTransferException;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void transfer(BankAccount source, BankAccount target, Money amount) throws MoneyTransferException {
        //TODO: Add validation here
        // 1) validate nothing is null
        // 2) validate source, target and amount has the same currency
        // 3) validate source has enough money to withdraw

        source.withdraw(amount);
        target.receive(amount);
    }
}
