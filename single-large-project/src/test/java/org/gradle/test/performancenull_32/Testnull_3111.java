package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3111 {
    private final Productionnull_3111 production = new Productionnull_3111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}