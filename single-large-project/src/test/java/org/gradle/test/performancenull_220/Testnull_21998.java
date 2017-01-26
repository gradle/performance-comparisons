package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21998 {
    private final Productionnull_21998 production = new Productionnull_21998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}