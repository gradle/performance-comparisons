package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11076 {
    private final Productionnull_11076 production = new Productionnull_11076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}