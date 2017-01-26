package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10932 {
    private final Productionnull_10932 production = new Productionnull_10932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}