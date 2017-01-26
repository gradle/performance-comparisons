package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3228 {
    private final Productionnull_3228 production = new Productionnull_3228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}