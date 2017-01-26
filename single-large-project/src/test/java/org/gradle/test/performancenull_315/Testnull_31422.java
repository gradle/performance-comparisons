package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31422 {
    private final Productionnull_31422 production = new Productionnull_31422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}