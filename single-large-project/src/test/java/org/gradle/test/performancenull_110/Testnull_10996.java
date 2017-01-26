package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10996 {
    private final Productionnull_10996 production = new Productionnull_10996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}