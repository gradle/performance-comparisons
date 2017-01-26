package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38409 {
    private final Productionnull_38409 production = new Productionnull_38409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}