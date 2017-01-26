package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2021 {
    private final Productionnull_2021 production = new Productionnull_2021("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}