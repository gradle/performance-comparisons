package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37483 {
    private final Productionnull_37483 production = new Productionnull_37483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}