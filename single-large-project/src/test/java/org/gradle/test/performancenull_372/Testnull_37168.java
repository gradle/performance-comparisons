package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37168 {
    private final Productionnull_37168 production = new Productionnull_37168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}