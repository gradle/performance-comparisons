package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42780 {
    private final Productionnull_42780 production = new Productionnull_42780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}