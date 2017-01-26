package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31382 {
    private final Productionnull_31382 production = new Productionnull_31382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}