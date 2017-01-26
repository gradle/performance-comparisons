package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23076 {
    private final Productionnull_23076 production = new Productionnull_23076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}