package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25462 {
    private final Productionnull_25462 production = new Productionnull_25462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}