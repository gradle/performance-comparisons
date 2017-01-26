package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2376 {
    private final Productionnull_2376 production = new Productionnull_2376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}