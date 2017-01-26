package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40008 {
    private final Productionnull_40008 production = new Productionnull_40008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}