package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40249 {
    private final Productionnull_40249 production = new Productionnull_40249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}