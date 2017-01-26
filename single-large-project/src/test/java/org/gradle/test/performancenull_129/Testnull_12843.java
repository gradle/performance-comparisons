package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12843 {
    private final Productionnull_12843 production = new Productionnull_12843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}