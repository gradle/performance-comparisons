package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22403 {
    private final Productionnull_22403 production = new Productionnull_22403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}