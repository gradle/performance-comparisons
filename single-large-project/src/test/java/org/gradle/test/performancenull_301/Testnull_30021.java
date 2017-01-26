package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30021 {
    private final Productionnull_30021 production = new Productionnull_30021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}