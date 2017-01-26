package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36098 {
    private final Productionnull_36098 production = new Productionnull_36098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}