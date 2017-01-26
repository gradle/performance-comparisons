package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3041 {
    private final Productionnull_3041 production = new Productionnull_3041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}