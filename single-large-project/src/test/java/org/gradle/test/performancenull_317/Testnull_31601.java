package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31601 {
    private final Productionnull_31601 production = new Productionnull_31601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}