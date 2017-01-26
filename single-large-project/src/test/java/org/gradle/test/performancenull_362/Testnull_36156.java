package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36156 {
    private final Productionnull_36156 production = new Productionnull_36156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}