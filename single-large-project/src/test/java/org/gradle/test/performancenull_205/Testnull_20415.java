package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20415 {
    private final Productionnull_20415 production = new Productionnull_20415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}