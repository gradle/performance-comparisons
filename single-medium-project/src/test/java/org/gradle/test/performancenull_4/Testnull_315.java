package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_315 {
    private final Productionnull_315 production = new Productionnull_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}