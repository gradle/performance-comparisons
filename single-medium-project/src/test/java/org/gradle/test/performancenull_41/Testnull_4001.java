package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4001 {
    private final Productionnull_4001 production = new Productionnull_4001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}