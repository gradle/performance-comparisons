package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13092 {
    private final Productionnull_13092 production = new Productionnull_13092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}