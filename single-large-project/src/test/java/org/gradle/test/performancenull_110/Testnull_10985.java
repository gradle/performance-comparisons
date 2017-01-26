package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10985 {
    private final Productionnull_10985 production = new Productionnull_10985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}