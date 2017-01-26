package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37425 {
    private final Productionnull_37425 production = new Productionnull_37425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}