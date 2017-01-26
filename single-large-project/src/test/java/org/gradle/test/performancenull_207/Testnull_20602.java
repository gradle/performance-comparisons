package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20602 {
    private final Productionnull_20602 production = new Productionnull_20602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}