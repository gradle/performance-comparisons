package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21942 {
    private final Productionnull_21942 production = new Productionnull_21942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}