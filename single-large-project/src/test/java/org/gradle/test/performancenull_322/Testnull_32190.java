package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32190 {
    private final Productionnull_32190 production = new Productionnull_32190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}