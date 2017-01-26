package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48061 {
    private final Productionnull_48061 production = new Productionnull_48061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}