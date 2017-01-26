package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3785 {
    private final Productionnull_3785 production = new Productionnull_3785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}