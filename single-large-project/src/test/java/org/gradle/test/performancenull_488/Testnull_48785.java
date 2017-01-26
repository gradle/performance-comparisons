package org.gradle.test.performancenull_488;

import static org.junit.Assert.*;

public class Testnull_48785 {
    private final Productionnull_48785 production = new Productionnull_48785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}