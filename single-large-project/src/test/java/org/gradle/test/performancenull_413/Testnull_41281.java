package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41281 {
    private final Productionnull_41281 production = new Productionnull_41281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}