package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10547 {
    private final Productionnull_10547 production = new Productionnull_10547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}