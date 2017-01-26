package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12469 {
    private final Productionnull_12469 production = new Productionnull_12469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}