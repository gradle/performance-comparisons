package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3563 {
    private final Productionnull_3563 production = new Productionnull_3563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}