package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32908 {
    private final Productionnull_32908 production = new Productionnull_32908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}