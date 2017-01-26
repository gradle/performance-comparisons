package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20546 {
    private final Productionnull_20546 production = new Productionnull_20546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}