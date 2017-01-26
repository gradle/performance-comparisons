package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5945 {
    private final Productionnull_5945 production = new Productionnull_5945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}