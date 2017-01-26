package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35221 {
    private final Productionnull_35221 production = new Productionnull_35221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}