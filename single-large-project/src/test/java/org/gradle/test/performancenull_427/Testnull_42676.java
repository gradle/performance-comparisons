package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42676 {
    private final Productionnull_42676 production = new Productionnull_42676("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}