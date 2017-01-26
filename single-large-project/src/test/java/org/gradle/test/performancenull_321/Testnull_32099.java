package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32099 {
    private final Productionnull_32099 production = new Productionnull_32099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}