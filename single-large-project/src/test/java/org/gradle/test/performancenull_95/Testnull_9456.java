package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9456 {
    private final Productionnull_9456 production = new Productionnull_9456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}