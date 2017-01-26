package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_64 {
    private final Productionnull_64 production = new Productionnull_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}