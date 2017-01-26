package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38282 {
    private final Productionnull_38282 production = new Productionnull_38282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}