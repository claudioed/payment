package tech.claudioed.cards.domain.repository;

import io.reactivex.Single;
import tech.claudioed.cards.domain.Card;
import tech.claudioed.cards.domain.CheckStatus;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
public interface CardRepository {

  Single<Card> register(final Card card);

  Single<CheckStatus> check(final Card data);

}
