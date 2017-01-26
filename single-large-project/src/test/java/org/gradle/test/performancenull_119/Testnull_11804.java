package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11804 {
    private final Productionnull_11804 production = new Productionnull_11804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}