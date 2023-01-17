package org.example.pages;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionAttribute;

import java.util.Date;

@Import
public class TicketResult {
    @Property
    @SessionAttribute
    private Boolean roundTrip;
    @Property
    @SessionAttribute
    private String departurePoint;
    @Property
    @SessionAttribute
    private String destination;
    @Property
    @SessionAttribute
    private Date departureDate;
    @Property
    @SessionAttribute
    private Date returnDate;
    @Property
    @SessionAttribute
    private Number numberOfPassengers;

    Object onActionFromPageLinkTicketSearch() {
        return TicketSearch.class;
    }
}
