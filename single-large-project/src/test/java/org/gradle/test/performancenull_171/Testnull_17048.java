package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17048 {
    private final Productionnull_17048 production = new Productionnull_17048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}