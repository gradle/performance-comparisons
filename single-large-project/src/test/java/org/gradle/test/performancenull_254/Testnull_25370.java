package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25370 {
    private final Productionnull_25370 production = new Productionnull_25370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}