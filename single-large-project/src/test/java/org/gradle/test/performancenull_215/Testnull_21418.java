package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21418 {
    private final Productionnull_21418 production = new Productionnull_21418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}