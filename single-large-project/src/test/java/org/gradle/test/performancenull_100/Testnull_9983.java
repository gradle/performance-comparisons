package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9983 {
    private final Productionnull_9983 production = new Productionnull_9983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}