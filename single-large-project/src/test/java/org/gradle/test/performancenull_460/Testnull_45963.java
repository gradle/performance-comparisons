package org.gradle.test.performancenull_460;

import static org.junit.Assert.*;

public class Testnull_45963 {
    private final Productionnull_45963 production = new Productionnull_45963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}