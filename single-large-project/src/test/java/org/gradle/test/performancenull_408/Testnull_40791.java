package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40791 {
    private final Productionnull_40791 production = new Productionnull_40791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}