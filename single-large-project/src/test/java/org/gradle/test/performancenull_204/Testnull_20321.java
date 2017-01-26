package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20321 {
    private final Productionnull_20321 production = new Productionnull_20321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}