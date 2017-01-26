package org.gradle.test.performancenull_56;

import static org.junit.Assert.*;

public class Testnull_5580 {
    private final Productionnull_5580 production = new Productionnull_5580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}