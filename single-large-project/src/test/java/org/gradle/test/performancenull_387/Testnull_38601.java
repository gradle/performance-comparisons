package org.gradle.test.performancenull_387;

import static org.junit.Assert.*;

public class Testnull_38601 {
    private final Productionnull_38601 production = new Productionnull_38601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}