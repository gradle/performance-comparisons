package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20495 {
    private final Productionnull_20495 production = new Productionnull_20495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}