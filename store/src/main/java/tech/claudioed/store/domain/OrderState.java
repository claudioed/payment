package tech.claudioed.store.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Value;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
@Value
@Builder
public class OrderState {

  String status;

  LocalDateTime changedAt;

}
