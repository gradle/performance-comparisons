package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22969 {
    private final Productionnull_22969 production = new Productionnull_22969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}