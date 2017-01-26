package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31205 {
    private final Productionnull_31205 production = new Productionnull_31205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}