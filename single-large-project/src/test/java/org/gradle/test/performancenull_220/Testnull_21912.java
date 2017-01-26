package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21912 {
    private final Productionnull_21912 production = new Productionnull_21912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}