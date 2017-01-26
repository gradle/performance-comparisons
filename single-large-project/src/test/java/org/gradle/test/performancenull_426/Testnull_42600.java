package org.gradle.test.performancenull_426;

import static org.junit.Assert.*;

public class Testnull_42600 {
    private final Productionnull_42600 production = new Productionnull_42600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}