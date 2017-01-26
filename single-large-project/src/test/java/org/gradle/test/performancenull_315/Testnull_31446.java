package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31446 {
    private final Productionnull_31446 production = new Productionnull_31446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}