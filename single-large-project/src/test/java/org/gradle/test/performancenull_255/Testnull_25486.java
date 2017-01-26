package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25486 {
    private final Productionnull_25486 production = new Productionnull_25486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}