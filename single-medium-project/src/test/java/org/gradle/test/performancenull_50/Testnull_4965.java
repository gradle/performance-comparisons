package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4965 {
    private final Productionnull_4965 production = new Productionnull_4965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}