package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18435 {
    private final Productionnull_18435 production = new Productionnull_18435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}