package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30048 {
    private final Productionnull_30048 production = new Productionnull_30048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}