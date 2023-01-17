package org.example.pages;

import org.apache.tapestry5.ValidationException;
import org.apache.tapestry5.annotations.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Import
public class TicketSearch {
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

    private final static List<String> cities = Stream.of("Moscow", "Cherepovets", "Leningrad", "Karaganda", "Vologda").sorted().collect(Collectors.toList());
    @Property
    private List<String> departurePoints = cities;
    @Property
    private List<String> destinationPoints = cities;

    public void onValidateFromTicketForm() throws ValidationException {
        System.out.println(numberOfPassengers);
        if (departurePoint.equals(destination))
            throw new ValidationException("Departure point cannot be the same as destination");
        if (roundTrip && departureDate.after(returnDate))
            throw new ValidationException("Departure date cannot be greater then return date");
    }

    public Object onSuccess() {
        if (!roundTrip)
            returnDate = null;

        return TicketResult.class;
    }
}


