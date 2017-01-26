package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31461 {
    private final Productionnull_31461 production = new Productionnull_31461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}