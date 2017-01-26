package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42931 {
    private final Productionnull_42931 production = new Productionnull_42931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}