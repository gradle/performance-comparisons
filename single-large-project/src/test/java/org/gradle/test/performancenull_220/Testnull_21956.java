package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21956 {
    private final Productionnull_21956 production = new Productionnull_21956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}