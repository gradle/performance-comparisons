package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2268 {
    private final Productionnull_2268 production = new Productionnull_2268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}