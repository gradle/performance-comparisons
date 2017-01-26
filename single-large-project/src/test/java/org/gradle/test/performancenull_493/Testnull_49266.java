package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49266 {
    private final Productionnull_49266 production = new Productionnull_49266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}