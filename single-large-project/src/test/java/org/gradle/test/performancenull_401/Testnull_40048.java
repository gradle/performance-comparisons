package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40048 {
    private final Productionnull_40048 production = new Productionnull_40048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}