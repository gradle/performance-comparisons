package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32081 {
    private final Productionnull_32081 production = new Productionnull_32081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}