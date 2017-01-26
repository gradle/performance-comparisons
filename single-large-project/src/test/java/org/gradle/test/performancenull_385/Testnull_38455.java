package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38455 {
    private final Productionnull_38455 production = new Productionnull_38455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}