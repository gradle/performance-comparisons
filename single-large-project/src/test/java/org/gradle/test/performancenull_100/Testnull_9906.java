package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9906 {
    private final Productionnull_9906 production = new Productionnull_9906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}