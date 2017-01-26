package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34945 {
    private final Productionnull_34945 production = new Productionnull_34945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}