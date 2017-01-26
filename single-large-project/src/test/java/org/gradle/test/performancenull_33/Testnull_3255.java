package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3255 {
    private final Productionnull_3255 production = new Productionnull_3255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}