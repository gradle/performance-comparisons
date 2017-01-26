package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30084 {
    private final Productionnull_30084 production = new Productionnull_30084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}