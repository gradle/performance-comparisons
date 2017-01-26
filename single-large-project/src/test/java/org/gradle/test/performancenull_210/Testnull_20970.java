package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20970 {
    private final Productionnull_20970 production = new Productionnull_20970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}