package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38426 {
    private final Productionnull_38426 production = new Productionnull_38426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}