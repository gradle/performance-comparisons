package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40855 {
    private final Productionnull_40855 production = new Productionnull_40855("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}