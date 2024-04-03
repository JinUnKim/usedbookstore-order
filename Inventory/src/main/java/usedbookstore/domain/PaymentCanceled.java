package usedbookstore.domain;

import java.util.*;
import lombok.*;
import usedbookstore.domain.*;
import usedbookstore.infra.AbstractEvent;

@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long paymentId;
    private Long orderId;
    private Long bookId;
    private Integer price;
    private String orderStatus;
    private Integer qty;
}
