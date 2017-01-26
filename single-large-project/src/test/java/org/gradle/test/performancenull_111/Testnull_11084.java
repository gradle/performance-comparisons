package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11084 {
    private final Productionnull_11084 production = new Productionnull_11084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}