package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17435 {
    private final Productionnull_17435 production = new Productionnull_17435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}