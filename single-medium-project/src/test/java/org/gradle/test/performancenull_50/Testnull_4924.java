package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4924 {
    private final Productionnull_4924 production = new Productionnull_4924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}