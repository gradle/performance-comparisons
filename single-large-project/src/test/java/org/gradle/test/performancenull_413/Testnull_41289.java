package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41289 {
    private final Productionnull_41289 production = new Productionnull_41289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}