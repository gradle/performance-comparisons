package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11937 {
    private final Productionnull_11937 production = new Productionnull_11937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}