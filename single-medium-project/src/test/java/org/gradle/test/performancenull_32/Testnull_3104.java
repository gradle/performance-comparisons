package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3104 {
    private final Productionnull_3104 production = new Productionnull_3104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}