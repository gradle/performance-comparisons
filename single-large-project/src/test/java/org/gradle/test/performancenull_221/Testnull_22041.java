package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22041 {
    private final Productionnull_22041 production = new Productionnull_22041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}