package org.gradle.test.performancenull_383;

import static org.junit.Assert.*;

public class Testnull_38266 {
    private final Productionnull_38266 production = new Productionnull_38266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}