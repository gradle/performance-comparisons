package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21980 {
    private final Productionnull_21980 production = new Productionnull_21980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}