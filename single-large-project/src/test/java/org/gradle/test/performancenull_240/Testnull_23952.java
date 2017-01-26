package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23952 {
    private final Productionnull_23952 production = new Productionnull_23952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}