package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9872 {
    private final Productionnull_9872 production = new Productionnull_9872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}