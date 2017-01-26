package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6110 {
    private final Productionnull_6110 production = new Productionnull_6110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}