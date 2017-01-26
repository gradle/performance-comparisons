package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31419 {
    private final Productionnull_31419 production = new Productionnull_31419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}