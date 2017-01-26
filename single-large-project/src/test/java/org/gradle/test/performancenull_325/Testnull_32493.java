package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32493 {
    private final Productionnull_32493 production = new Productionnull_32493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}