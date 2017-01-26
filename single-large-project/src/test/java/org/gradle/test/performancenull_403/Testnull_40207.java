package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40207 {
    private final Productionnull_40207 production = new Productionnull_40207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}