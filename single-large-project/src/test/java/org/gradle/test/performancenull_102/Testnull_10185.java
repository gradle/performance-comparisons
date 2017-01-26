package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10185 {
    private final Productionnull_10185 production = new Productionnull_10185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}