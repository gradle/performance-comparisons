package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3142 {
    private final Productionnull_3142 production = new Productionnull_3142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}