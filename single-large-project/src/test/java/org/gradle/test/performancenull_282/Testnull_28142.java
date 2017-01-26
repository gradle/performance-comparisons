package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28142 {
    private final Productionnull_28142 production = new Productionnull_28142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}