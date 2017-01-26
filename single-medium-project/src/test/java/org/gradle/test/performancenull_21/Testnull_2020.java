package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2020 {
    private final Productionnull_2020 production = new Productionnull_2020("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}