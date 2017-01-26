package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20361 {
    private final Productionnull_20361 production = new Productionnull_20361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}