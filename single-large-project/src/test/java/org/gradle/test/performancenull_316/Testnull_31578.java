package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31578 {
    private final Productionnull_31578 production = new Productionnull_31578("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}