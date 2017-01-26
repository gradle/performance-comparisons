package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20427 {
    private final Productionnull_20427 production = new Productionnull_20427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}