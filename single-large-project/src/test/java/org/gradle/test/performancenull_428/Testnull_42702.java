package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42702 {
    private final Productionnull_42702 production = new Productionnull_42702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}