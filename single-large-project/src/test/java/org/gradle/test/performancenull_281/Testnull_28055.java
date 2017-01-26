package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28055 {
    private final Productionnull_28055 production = new Productionnull_28055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}