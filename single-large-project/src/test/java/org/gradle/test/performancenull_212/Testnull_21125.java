package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21125 {
    private final Productionnull_21125 production = new Productionnull_21125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}