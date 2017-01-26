package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28096 {
    private final Productionnull_28096 production = new Productionnull_28096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}