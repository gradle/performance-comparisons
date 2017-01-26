package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7093 {
    private final Productionnull_7093 production = new Productionnull_7093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}