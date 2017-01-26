package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23704 {
    private final Productionnull_23704 production = new Productionnull_23704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}