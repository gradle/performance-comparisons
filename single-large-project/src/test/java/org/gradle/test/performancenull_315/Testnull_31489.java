package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31489 {
    private final Productionnull_31489 production = new Productionnull_31489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}