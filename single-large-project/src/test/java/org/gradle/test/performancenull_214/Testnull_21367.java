package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21367 {
    private final Productionnull_21367 production = new Productionnull_21367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}