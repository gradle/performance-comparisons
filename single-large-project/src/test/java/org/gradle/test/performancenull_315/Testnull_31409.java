package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31409 {
    private final Productionnull_31409 production = new Productionnull_31409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}