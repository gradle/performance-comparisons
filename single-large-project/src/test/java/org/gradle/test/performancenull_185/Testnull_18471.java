package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18471 {
    private final Productionnull_18471 production = new Productionnull_18471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}