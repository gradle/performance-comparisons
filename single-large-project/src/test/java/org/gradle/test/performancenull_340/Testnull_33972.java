package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33972 {
    private final Productionnull_33972 production = new Productionnull_33972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}