package org.gradle.test.performancenull_471;

import static org.junit.Assert.*;

public class Testnull_47081 {
    private final Productionnull_47081 production = new Productionnull_47081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}