package org.gradle.test.performancenull_89;

import static org.junit.Assert.*;

public class Testnull_8801 {
    private final Productionnull_8801 production = new Productionnull_8801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}