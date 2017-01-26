package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37402 {
    private final Productionnull_37402 production = new Productionnull_37402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}