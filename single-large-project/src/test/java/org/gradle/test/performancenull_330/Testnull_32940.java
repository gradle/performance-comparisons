package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32940 {
    private final Productionnull_32940 production = new Productionnull_32940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}