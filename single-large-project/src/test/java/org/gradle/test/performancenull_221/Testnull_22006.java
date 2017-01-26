package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22006 {
    private final Productionnull_22006 production = new Productionnull_22006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}