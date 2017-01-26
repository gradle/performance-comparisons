package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34970 {
    private final Productionnull_34970 production = new Productionnull_34970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}