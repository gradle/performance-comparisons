package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40298 {
    private final Productionnull_40298 production = new Productionnull_40298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}