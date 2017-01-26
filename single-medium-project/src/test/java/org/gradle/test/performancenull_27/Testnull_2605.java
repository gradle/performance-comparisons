package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2605 {
    private final Productionnull_2605 production = new Productionnull_2605("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}