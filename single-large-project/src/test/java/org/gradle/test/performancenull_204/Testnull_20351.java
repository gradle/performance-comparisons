package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20351 {
    private final Productionnull_20351 production = new Productionnull_20351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}