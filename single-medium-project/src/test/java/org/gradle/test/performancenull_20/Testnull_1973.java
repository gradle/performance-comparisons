package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1973 {
    private final Productionnull_1973 production = new Productionnull_1973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}