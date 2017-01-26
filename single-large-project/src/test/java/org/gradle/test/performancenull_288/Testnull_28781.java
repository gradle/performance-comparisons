package org.gradle.test.performancenull_288;

import static org.junit.Assert.*;

public class Testnull_28781 {
    private final Productionnull_28781 production = new Productionnull_28781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}