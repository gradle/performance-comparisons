package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40297 {
    private final Productionnull_40297 production = new Productionnull_40297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}