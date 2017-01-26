package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20372 {
    private final Productionnull_20372 production = new Productionnull_20372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}