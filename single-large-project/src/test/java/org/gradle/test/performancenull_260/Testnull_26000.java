package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_26000 {
    private final Productionnull_26000 production = new Productionnull_26000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}