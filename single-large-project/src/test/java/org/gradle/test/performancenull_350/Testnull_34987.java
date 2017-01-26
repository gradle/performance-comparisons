package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34987 {
    private final Productionnull_34987 production = new Productionnull_34987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}