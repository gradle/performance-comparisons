package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36480 {
    private final Productionnull_36480 production = new Productionnull_36480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}