package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9975 {
    private final Productionnull_9975 production = new Productionnull_9975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}