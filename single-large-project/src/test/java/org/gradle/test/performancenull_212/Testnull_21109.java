package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21109 {
    private final Productionnull_21109 production = new Productionnull_21109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}