package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35285 {
    private final Productionnull_35285 production = new Productionnull_35285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}