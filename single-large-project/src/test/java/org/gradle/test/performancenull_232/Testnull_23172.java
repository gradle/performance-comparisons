package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23172 {
    private final Productionnull_23172 production = new Productionnull_23172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}