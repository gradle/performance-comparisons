package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_111 {
    private final Productionnull_111 production = new Productionnull_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}