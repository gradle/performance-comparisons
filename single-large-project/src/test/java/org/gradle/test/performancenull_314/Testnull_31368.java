package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31368 {
    private final Productionnull_31368 production = new Productionnull_31368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}