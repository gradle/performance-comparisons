package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9844 {
    private final Productionnull_9844 production = new Productionnull_9844("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}