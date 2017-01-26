package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2474 {
    private final Productionnull_2474 production = new Productionnull_2474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}