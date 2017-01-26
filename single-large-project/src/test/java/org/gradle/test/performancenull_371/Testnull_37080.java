package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37080 {
    private final Productionnull_37080 production = new Productionnull_37080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}