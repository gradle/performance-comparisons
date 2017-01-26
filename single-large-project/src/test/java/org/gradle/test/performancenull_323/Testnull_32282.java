package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32282 {
    private final Productionnull_32282 production = new Productionnull_32282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}