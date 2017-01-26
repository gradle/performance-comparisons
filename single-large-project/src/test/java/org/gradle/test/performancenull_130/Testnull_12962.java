package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12962 {
    private final Productionnull_12962 production = new Productionnull_12962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}