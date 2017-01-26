package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28048 {
    private final Productionnull_28048 production = new Productionnull_28048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}