package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1790 {
    private final Productionnull_1790 production = new Productionnull_1790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}