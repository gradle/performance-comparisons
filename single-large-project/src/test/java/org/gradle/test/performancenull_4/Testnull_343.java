package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_343 {
    private final Productionnull_343 production = new Productionnull_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}