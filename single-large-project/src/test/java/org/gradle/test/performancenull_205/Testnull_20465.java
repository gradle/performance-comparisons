package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20465 {
    private final Productionnull_20465 production = new Productionnull_20465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}