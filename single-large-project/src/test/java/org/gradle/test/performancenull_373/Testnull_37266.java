package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37266 {
    private final Productionnull_37266 production = new Productionnull_37266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}