package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3154 {
    private final Productionnull_3154 production = new Productionnull_3154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}