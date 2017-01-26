package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_121 {
    private final Productionnull_121 production = new Productionnull_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}