package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11099 {
    private final Productionnull_11099 production = new Productionnull_11099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}