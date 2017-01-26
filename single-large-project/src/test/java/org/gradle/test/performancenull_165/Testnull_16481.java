package org.gradle.test.performancenull_165;

import static org.junit.Assert.*;

public class Testnull_16481 {
    private final Productionnull_16481 production = new Productionnull_16481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}