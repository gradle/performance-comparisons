package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18483 {
    private final Productionnull_18483 production = new Productionnull_18483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}