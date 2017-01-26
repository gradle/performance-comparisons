package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10150 {
    private final Productionnull_10150 production = new Productionnull_10150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}