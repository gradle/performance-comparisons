package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3159 {
    private final Productionnull_3159 production = new Productionnull_3159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}