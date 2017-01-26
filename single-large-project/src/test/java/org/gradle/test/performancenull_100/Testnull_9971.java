package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9971 {
    private final Productionnull_9971 production = new Productionnull_9971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}