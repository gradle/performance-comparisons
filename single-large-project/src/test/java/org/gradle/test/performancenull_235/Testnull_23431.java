package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23431 {
    private final Productionnull_23431 production = new Productionnull_23431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}