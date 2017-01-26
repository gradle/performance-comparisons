package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9981 {
    private final Productionnull_9981 production = new Productionnull_9981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}