package tech.claudioed.authorization.domain;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
@Value
@Builder
public class Transaction {

  String id;

  BigDecimal amount;

}
