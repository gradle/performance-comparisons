package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19198 {
    private final Productionnull_19198 production = new Productionnull_19198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}