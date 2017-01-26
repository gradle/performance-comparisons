package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32966 {
    private final Productionnull_32966 production = new Productionnull_32966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}