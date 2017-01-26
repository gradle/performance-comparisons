package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2681 {
    private final Productionnull_2681 production = new Productionnull_2681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}