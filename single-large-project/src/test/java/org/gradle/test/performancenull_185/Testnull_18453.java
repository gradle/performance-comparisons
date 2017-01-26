package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18453 {
    private final Productionnull_18453 production = new Productionnull_18453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}