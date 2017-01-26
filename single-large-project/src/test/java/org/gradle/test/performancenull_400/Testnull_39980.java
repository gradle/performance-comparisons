package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39980 {
    private final Productionnull_39980 production = new Productionnull_39980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}