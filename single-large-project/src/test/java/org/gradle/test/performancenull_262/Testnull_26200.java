package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26200 {
    private final Productionnull_26200 production = new Productionnull_26200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}