package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20684 {
    private final Productionnull_20684 production = new Productionnull_20684("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}