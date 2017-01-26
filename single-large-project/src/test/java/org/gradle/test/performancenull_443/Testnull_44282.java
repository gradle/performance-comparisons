package org.gradle.test.performancenull_443;

import static org.junit.Assert.*;

public class Testnull_44282 {
    private final Productionnull_44282 production = new Productionnull_44282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}