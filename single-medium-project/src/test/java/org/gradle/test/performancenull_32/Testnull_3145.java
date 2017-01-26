package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3145 {
    private final Productionnull_3145 production = new Productionnull_3145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}