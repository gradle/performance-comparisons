package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37406 {
    private final Productionnull_37406 production = new Productionnull_37406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}