package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4780 {
    private final Productionnull_4780 production = new Productionnull_4780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}