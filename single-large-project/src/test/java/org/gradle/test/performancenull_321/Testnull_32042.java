package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32042 {
    private final Productionnull_32042 production = new Productionnull_32042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}