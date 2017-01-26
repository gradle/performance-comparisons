package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19465 {
    private final Productionnull_19465 production = new Productionnull_19465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}