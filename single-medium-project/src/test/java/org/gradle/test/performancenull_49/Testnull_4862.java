package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4862 {
    private final Productionnull_4862 production = new Productionnull_4862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}