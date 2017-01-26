package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32002 {
    private final Productionnull_32002 production = new Productionnull_32002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}