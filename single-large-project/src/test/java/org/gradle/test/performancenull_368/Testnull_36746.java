package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36746 {
    private final Productionnull_36746 production = new Productionnull_36746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}