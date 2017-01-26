package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25823 {
    private final Productionnull_25823 production = new Productionnull_25823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}