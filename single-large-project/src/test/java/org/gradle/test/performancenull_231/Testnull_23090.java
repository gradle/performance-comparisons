package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23090 {
    private final Productionnull_23090 production = new Productionnull_23090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}