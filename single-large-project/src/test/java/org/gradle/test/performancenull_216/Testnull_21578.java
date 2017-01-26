package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21578 {
    private final Productionnull_21578 production = new Productionnull_21578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}