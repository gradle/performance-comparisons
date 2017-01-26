package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23368 {
    private final Productionnull_23368 production = new Productionnull_23368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}