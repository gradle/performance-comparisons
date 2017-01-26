package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48381 {
    private final Productionnull_48381 production = new Productionnull_48381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}