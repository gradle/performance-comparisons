package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3197 {
    private final Productionnull_3197 production = new Productionnull_3197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}