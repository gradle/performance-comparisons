package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5902 {
    private final Productionnull_5902 production = new Productionnull_5902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}