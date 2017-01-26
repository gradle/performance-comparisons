package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10041 {
    private final Productionnull_10041 production = new Productionnull_10041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}