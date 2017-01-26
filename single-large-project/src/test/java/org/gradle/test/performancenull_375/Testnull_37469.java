package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37469 {
    private final Productionnull_37469 production = new Productionnull_37469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}