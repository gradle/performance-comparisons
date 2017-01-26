package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38489 {
    private final Productionnull_38489 production = new Productionnull_38489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}