package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38431 {
    private final Productionnull_38431 production = new Productionnull_38431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}