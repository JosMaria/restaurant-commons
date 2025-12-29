package org.lievasoft.commons.ticket;

import java.time.LocalDateTime;

public record TicketIsPaidUpdateResponse(
        Long ticketId,
        boolean isPaid,
        LocalDateTime updatedAt
) {
}
