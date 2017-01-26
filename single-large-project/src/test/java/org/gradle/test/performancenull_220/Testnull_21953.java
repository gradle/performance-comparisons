package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21953 {
    private final Productionnull_21953 production = new Productionnull_21953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}