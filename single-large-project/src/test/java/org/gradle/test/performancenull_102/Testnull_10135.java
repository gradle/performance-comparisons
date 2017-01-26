package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10135 {
    private final Productionnull_10135 production = new Productionnull_10135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}