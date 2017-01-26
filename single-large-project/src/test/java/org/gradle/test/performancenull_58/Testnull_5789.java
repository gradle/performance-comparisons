package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5789 {
    private final Productionnull_5789 production = new Productionnull_5789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}