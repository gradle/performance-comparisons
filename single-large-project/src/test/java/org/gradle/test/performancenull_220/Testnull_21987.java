package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21987 {
    private final Productionnull_21987 production = new Productionnull_21987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}