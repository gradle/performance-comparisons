package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3191 {
    private final Productionnull_3191 production = new Productionnull_3191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}