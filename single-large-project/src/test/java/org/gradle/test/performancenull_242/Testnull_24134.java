package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24134 {
    private final Productionnull_24134 production = new Productionnull_24134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}