package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3945 {
    private final Productionnull_3945 production = new Productionnull_3945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}