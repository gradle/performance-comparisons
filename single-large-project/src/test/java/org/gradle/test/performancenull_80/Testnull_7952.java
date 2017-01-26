package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7952 {
    private final Productionnull_7952 production = new Productionnull_7952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}