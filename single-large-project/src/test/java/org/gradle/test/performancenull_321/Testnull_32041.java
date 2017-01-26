package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32041 {
    private final Productionnull_32041 production = new Productionnull_32041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}