package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37205 {
    private final Productionnull_37205 production = new Productionnull_37205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}