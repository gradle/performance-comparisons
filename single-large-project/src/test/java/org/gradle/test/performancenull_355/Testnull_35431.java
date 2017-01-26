package org.gradle.test.performancenull_355;

import static org.junit.Assert.*;

public class Testnull_35431 {
    private final Productionnull_35431 production = new Productionnull_35431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}