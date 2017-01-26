package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33969 {
    private final Productionnull_33969 production = new Productionnull_33969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}