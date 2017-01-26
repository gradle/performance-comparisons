package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40278 {
    private final Productionnull_40278 production = new Productionnull_40278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}