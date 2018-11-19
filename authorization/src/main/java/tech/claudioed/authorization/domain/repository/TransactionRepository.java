package tech.claudioed.authorization.domain.repository;

import io.reactivex.Single;
import tech.claudioed.authorization.domain.Transaction;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public interface TransactionRepository {

  Single<Transaction> register(final Transaction transaction);

}
