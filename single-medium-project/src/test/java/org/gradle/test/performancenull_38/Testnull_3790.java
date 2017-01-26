package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3790 {
    private final Productionnull_3790 production = new Productionnull_3790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}