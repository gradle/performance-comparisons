package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35936 {
    private final Productionnull_35936 production = new Productionnull_35936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}