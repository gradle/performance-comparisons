package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12001 {
    private final Productionnull_12001 production = new Productionnull_12001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}