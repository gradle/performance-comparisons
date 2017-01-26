package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28002 {
    private final Productionnull_28002 production = new Productionnull_28002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}