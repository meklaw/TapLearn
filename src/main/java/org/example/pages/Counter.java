package org.example.pages;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.SessionAttribute;

@Import
public class Counter {
    @SessionAttribute
    private int counter = 0;

    public int getCounter() {
        System.out.println("Getting counter value: " + counter);
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @OnEvent(value = "click", component = "incrementButton")
    public void incrementButton() {
        System.out.println("Incrementing counter");
        counter++;
        System.out.println(counter);
    }
}
