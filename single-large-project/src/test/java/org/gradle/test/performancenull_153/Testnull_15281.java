package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15281 {
    private final Productionnull_15281 production = new Productionnull_15281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}