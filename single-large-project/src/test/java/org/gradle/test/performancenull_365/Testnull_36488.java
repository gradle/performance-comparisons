package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36488 {
    private final Productionnull_36488 production = new Productionnull_36488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}