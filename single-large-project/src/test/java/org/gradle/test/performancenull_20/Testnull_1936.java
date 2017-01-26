package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1936 {
    private final Productionnull_1936 production = new Productionnull_1936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}