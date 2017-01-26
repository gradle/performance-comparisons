package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23051 {
    private final Productionnull_23051 production = new Productionnull_23051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}