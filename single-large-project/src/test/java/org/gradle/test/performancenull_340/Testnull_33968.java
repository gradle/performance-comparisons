package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33968 {
    private final Productionnull_33968 production = new Productionnull_33968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}