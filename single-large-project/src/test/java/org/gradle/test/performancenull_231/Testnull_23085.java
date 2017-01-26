package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23085 {
    private final Productionnull_23085 production = new Productionnull_23085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}