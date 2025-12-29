package org.lievasoft.commons.ticket;

import java.time.LocalDateTime;
import java.util.List;

public record TicketCreateResponse(
        Long ticketId,
        String waiterId,
        LocalDateTime createdAt,
        boolean isPaid,
        List<OrderCreateResponse> ordersCreateResponse
) {
    public record OrderCreateResponse(
            String foodId,
            int quantity,
            boolean toGo
    ) {
    }
}
