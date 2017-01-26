package org.gradle.test.performancenull_26;

import static org.junit.Assert.*;

public class Testnull_2549 {
    private final Productionnull_2549 production = new Productionnull_2549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}