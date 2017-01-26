package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18092 {
    private final Productionnull_18092 production = new Productionnull_18092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}