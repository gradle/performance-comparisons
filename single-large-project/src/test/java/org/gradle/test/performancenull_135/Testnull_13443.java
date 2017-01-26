package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13443 {
    private final Productionnull_13443 production = new Productionnull_13443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}