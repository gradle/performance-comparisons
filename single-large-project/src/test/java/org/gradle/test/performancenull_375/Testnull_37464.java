package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37464 {
    private final Productionnull_37464 production = new Productionnull_37464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}