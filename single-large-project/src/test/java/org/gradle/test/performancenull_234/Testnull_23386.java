package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23386 {
    private final Productionnull_23386 production = new Productionnull_23386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}