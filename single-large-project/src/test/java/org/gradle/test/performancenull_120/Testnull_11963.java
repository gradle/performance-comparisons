package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11963 {
    private final Productionnull_11963 production = new Productionnull_11963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}