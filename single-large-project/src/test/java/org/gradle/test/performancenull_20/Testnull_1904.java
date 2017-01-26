package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1904 {
    private final Productionnull_1904 production = new Productionnull_1904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}