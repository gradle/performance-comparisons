package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12998 {
    private final Productionnull_12998 production = new Productionnull_12998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}