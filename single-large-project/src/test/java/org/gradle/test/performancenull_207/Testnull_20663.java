package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20663 {
    private final Productionnull_20663 production = new Productionnull_20663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}