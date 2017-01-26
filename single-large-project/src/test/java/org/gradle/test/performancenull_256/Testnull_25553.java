package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25553 {
    private final Productionnull_25553 production = new Productionnull_25553("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}