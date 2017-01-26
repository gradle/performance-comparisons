package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7945 {
    private final Productionnull_7945 production = new Productionnull_7945("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}