package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31902 {
    private final Productionnull_31902 production = new Productionnull_31902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}