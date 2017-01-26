package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3580 {
    private final Productionnull_3580 production = new Productionnull_3580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}