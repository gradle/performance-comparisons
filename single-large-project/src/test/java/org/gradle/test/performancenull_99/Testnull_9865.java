package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9865 {
    private final Productionnull_9865 production = new Productionnull_9865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}