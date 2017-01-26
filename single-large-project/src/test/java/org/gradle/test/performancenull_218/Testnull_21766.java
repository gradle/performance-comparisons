package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21766 {
    private final Productionnull_21766 production = new Productionnull_21766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}