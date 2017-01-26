package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21972 {
    private final Productionnull_21972 production = new Productionnull_21972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}