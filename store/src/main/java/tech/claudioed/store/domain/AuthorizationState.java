package tech.claudioed.store.domain;

import lombok.Builder;
import lombok.Value;

/**
 * @author claudioed on 19/11/18.
 * Project payment
 */
@Value
@Builder
public class AuthorizationState {

  String status;

  String processedAt;

  Order order;

}
