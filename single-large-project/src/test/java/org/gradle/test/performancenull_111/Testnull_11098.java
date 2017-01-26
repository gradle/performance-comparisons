package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11098 {
    private final Productionnull_11098 production = new Productionnull_11098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}