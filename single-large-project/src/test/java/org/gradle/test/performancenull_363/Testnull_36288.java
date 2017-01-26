package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36288 {
    private final Productionnull_36288 production = new Productionnull_36288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}