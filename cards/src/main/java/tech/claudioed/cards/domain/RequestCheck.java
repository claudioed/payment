package tech.claudioed.cards.domain;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

/**
 * @author claudioed on 20/11/18.
 * Project payment
 */
@Value
@Builder
public class RequestCheck {

  String number;

  String expireAt;

  BigDecimal amount;

}
