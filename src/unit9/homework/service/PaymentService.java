package unit9.homework.service;

import unit9.homework.domain.BankAccount;
import unit9.homework.domain.Money;
import unit9.homework.exception.MoneyTransferException;

public interface PaymentService {
    void transfer(BankAccount source, BankAccount target, Money amount) throws MoneyTransferException;
}
