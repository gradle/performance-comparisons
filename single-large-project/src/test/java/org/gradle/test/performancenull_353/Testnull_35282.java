package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35282 {
    private final Productionnull_35282 production = new Productionnull_35282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}