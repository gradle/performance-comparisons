package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1024 {
    private final Productionnull_1024 production = new Productionnull_1024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}