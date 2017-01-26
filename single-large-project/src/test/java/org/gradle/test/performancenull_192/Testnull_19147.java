package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19147 {
    private final Productionnull_19147 production = new Productionnull_19147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}