package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1605 {
    private final Productionnull_1605 production = new Productionnull_1605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}