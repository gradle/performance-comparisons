package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40622 {
    private final Productionnull_40622 production = new Productionnull_40622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}