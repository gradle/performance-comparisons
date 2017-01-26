package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2084 {
    private final Productionnull_2084 production = new Productionnull_2084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}