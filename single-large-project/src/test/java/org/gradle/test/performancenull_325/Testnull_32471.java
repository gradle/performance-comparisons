package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32471 {
    private final Productionnull_32471 production = new Productionnull_32471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}