package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31041 {
    private final Productionnull_31041 production = new Productionnull_31041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}