package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40834 {
    private final Productionnull_40834 production = new Productionnull_40834("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}