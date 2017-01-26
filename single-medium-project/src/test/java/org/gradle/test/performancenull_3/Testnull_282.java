package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_282 {
    private final Productionnull_282 production = new Productionnull_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}