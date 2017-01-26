package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7929 {
    private final Productionnull_7929 production = new Productionnull_7929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}