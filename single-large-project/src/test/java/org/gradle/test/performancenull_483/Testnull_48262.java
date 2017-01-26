package org.gradle.test.performancenull_483;

import static org.junit.Assert.*;

public class Testnull_48262 {
    private final Productionnull_48262 production = new Productionnull_48262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}