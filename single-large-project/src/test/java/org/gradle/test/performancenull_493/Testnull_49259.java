package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49259 {
    private final Productionnull_49259 production = new Productionnull_49259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}