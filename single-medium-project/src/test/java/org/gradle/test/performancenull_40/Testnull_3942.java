package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3942 {
    private final Productionnull_3942 production = new Productionnull_3942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}