package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14994 {
    private final Productionnull_14994 production = new Productionnull_14994("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}