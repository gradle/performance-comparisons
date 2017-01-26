package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_9000 {
    private final Productionnull_9000 production = new Productionnull_9000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}