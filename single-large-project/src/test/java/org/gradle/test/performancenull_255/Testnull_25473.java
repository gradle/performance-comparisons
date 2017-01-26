package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25473 {
    private final Productionnull_25473 production = new Productionnull_25473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}