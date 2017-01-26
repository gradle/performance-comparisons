package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21975 {
    private final Productionnull_21975 production = new Productionnull_21975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}