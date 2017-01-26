package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42110 {
    private final Productionnull_42110 production = new Productionnull_42110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}