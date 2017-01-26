package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4949 {
    private final Productionnull_4949 production = new Productionnull_4949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}