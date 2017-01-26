package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20322 {
    private final Productionnull_20322 production = new Productionnull_20322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}