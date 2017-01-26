package org.gradle.test.performancenull_288;

import static org.junit.Assert.*;

public class Testnull_28746 {
    private final Productionnull_28746 production = new Productionnull_28746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}