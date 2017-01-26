package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_103 {
    private final Productionnull_103 production = new Productionnull_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}