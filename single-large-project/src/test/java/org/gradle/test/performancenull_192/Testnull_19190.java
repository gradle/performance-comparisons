package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19190 {
    private final Productionnull_19190 production = new Productionnull_19190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}