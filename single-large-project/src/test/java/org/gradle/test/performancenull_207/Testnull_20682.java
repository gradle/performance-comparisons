package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20682 {
    private final Productionnull_20682 production = new Productionnull_20682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}