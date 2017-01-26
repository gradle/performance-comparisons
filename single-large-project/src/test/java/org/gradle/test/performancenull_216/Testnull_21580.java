package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21580 {
    private final Productionnull_21580 production = new Productionnull_21580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}