package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3194 {
    private final Productionnull_3194 production = new Productionnull_3194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}