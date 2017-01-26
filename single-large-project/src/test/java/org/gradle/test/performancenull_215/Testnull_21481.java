package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21481 {
    private final Productionnull_21481 production = new Productionnull_21481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}