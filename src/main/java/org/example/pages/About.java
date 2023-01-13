package org.example.pages;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.PageActivationContext;

@Import
public class About {

    @PageActivationContext
    private String learn;

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }
}
