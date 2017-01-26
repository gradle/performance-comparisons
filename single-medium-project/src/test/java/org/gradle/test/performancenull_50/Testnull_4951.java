package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4951 {
    private final Productionnull_4951 production = new Productionnull_4951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}