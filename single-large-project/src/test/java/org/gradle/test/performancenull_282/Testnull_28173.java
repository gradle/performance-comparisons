package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28173 {
    private final Productionnull_28173 production = new Productionnull_28173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}