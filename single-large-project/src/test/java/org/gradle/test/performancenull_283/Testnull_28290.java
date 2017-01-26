package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28290 {
    private final Productionnull_28290 production = new Productionnull_28290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}