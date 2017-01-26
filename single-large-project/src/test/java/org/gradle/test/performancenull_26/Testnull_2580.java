package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2580 {
    private final Productionnull_2580 production = new Productionnull_2580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}