package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2023 {
    private final Productionnull_2023 production = new Productionnull_2023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}