package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21413 {
    private final Productionnull_21413 production = new Productionnull_21413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}