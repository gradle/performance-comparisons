package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41370 {
    private final Productionnull_41370 production = new Productionnull_41370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}