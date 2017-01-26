package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19188 {
    private final Productionnull_19188 production = new Productionnull_19188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}