package org.gradle.test.performancenull_367;

import static org.junit.Assert.*;

public class Testnull_36601 {
    private final Productionnull_36601 production = new Productionnull_36601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}