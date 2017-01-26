package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28461 {
    private final Productionnull_28461 production = new Productionnull_28461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}