package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_20000 {
    private final Productionnull_20000 production = new Productionnull_20000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}