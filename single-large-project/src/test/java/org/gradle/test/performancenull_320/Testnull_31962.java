package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31962 {
    private final Productionnull_31962 production = new Productionnull_31962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}