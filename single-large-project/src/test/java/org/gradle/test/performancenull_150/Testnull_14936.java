package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14936 {
    private final Productionnull_14936 production = new Productionnull_14936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}