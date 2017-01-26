package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12825 {
    private final Productionnull_12825 production = new Productionnull_12825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}