package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2680 {
    private final Productionnull_2680 production = new Productionnull_2680("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}