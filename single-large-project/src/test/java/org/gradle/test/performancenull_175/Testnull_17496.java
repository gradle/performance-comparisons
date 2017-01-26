package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17496 {
    private final Productionnull_17496 production = new Productionnull_17496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}