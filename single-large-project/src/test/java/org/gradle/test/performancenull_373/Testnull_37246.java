package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37246 {
    private final Productionnull_37246 production = new Productionnull_37246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}