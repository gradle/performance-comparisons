package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47298 {
    private final Productionnull_47298 production = new Productionnull_47298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}