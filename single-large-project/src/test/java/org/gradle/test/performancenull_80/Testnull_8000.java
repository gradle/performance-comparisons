package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_8000 {
    private final Productionnull_8000 production = new Productionnull_8000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}