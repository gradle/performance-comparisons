package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37271 {
    private final Productionnull_37271 production = new Productionnull_37271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}