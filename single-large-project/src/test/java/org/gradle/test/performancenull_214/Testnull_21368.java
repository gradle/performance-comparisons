package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21368 {
    private final Productionnull_21368 production = new Productionnull_21368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}