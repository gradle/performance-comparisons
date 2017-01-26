package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18789 {
    private final Productionnull_18789 production = new Productionnull_18789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}