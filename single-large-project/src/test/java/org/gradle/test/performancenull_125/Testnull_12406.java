package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12406 {
    private final Productionnull_12406 production = new Productionnull_12406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}