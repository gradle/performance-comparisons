package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21969 {
    private final Productionnull_21969 production = new Productionnull_21969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}