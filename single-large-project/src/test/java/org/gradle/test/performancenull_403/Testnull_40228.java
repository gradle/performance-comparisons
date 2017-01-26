package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40228 {
    private final Productionnull_40228 production = new Productionnull_40228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}