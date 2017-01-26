package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21410 {
    private final Productionnull_21410 production = new Productionnull_21410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}