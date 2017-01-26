package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17998 {
    private final Productionnull_17998 production = new Productionnull_17998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}