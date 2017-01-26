package org.gradle.test.performancenull_208;

import static org.junit.Assert.*;

public class Testnull_20749 {
    private final Productionnull_20749 production = new Productionnull_20749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}