package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31298 {
    private final Productionnull_31298 production = new Productionnull_31298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}