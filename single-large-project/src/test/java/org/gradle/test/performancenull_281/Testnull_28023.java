package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28023 {
    private final Productionnull_28023 production = new Productionnull_28023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}