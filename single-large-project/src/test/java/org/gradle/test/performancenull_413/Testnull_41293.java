package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41293 {
    private final Productionnull_41293 production = new Productionnull_41293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}