package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14952 {
    private final Productionnull_14952 production = new Productionnull_14952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}