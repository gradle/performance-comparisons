package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42580 {
    private final Productionnull_42580 production = new Productionnull_42580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}