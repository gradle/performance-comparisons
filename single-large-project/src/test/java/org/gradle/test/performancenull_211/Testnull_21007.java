package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21007 {
    private final Productionnull_21007 production = new Productionnull_21007("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}