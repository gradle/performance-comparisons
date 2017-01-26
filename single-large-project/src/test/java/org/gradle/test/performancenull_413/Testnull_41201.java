package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41201 {
    private final Productionnull_41201 production = new Productionnull_41201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}