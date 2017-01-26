package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33943 {
    private final Productionnull_33943 production = new Productionnull_33943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}