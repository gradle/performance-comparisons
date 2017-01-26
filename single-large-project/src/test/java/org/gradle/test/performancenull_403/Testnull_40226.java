package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40226 {
    private final Productionnull_40226 production = new Productionnull_40226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}