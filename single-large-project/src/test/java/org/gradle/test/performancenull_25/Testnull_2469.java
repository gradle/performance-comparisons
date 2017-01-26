package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2469 {
    private final Productionnull_2469 production = new Productionnull_2469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}