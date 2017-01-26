package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12465 {
    private final Productionnull_12465 production = new Productionnull_12465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}