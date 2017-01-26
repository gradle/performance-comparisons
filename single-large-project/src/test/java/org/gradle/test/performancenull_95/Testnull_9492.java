package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9492 {
    private final Productionnull_9492 production = new Productionnull_9492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}