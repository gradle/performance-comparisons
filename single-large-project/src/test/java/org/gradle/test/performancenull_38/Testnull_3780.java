package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3780 {
    private final Productionnull_3780 production = new Productionnull_3780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}