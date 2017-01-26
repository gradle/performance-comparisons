package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22463 {
    private final Productionnull_22463 production = new Productionnull_22463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}