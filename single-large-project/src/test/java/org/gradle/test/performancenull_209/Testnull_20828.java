package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20828 {
    private final Productionnull_20828 production = new Productionnull_20828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}