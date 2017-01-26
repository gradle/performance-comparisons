package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9706 {
    private final Productionnull_9706 production = new Productionnull_9706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}