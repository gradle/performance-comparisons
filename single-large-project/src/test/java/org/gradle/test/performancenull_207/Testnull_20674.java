package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20674 {
    private final Productionnull_20674 production = new Productionnull_20674("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}