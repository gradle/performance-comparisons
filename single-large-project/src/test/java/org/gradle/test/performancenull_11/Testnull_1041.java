package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1041 {
    private final Productionnull_1041 production = new Productionnull_1041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}