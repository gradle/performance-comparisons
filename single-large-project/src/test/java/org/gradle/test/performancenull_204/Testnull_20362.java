package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20362 {
    private final Productionnull_20362 production = new Productionnull_20362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}