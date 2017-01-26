package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3566 {
    private final Productionnull_3566 production = new Productionnull_3566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}