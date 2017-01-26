package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32698 {
    private final Productionnull_32698 production = new Productionnull_32698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}