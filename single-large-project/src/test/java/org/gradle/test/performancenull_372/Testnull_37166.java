package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37166 {
    private final Productionnull_37166 production = new Productionnull_37166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}