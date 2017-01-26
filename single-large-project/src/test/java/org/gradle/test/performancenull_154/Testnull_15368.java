package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15368 {
    private final Productionnull_15368 production = new Productionnull_15368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}