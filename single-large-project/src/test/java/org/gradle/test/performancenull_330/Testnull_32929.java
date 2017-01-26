package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32929 {
    private final Productionnull_32929 production = new Productionnull_32929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}