package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14081 {
    private final Productionnull_14081 production = new Productionnull_14081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}