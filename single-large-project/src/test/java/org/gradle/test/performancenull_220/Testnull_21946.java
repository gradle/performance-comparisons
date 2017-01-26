package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21946 {
    private final Productionnull_21946 production = new Productionnull_21946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}