package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_449 {
    private final Production28_449 production = new Production28_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}