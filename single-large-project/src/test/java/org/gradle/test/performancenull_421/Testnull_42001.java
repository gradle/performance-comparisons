package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42001 {
    private final Productionnull_42001 production = new Productionnull_42001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}